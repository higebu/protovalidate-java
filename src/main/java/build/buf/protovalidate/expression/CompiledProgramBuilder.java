// Copyright 2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf.protovalidate.expression;


import build.buf.protovalidate.results.CompilationException;
import com.google.api.expr.v1alpha1.Type;
import org.projectnessie.cel.Ast;
import org.projectnessie.cel.Env;
import org.projectnessie.cel.Program;
import org.projectnessie.cel.ProgramOption;
import org.projectnessie.cel.common.Source;

/**
 * CompiledAst is a compiled CEL {@link Ast}.
 */
public class CompiledProgramBuilder {
    private final Env env;
    public final Ast ast;
    public final Expression source;

    CompiledProgramBuilder(Env env, Ast ast, Expression source) {
        this.env = env;
        this.ast = ast;
        this.source = source;
    }

    /**
     * Compiles the given expression to a CompiledAst.
     */
    public static CompiledProgramBuilder newBuilder(Env env, Expression expr) throws CompilationException {
        env.parseSource(Source.newTextSource(expr.expression));
        Env.AstIssuesTuple astIssuesTuple = env.compile(expr.expression);
        if (astIssuesTuple.hasIssues()) {
            throw new CompilationException("failed to compile expression " + expr.id);
        }
        Ast ast = astIssuesTuple.getAst();
        Type outType = ast.getResultType();
        if (!outType.getPrimitive().equals(Type.PrimitiveType.BOOL) && !outType.getPrimitive().equals(Type.PrimitiveType.STRING)) {
            throw new CompilationException("expression outputs, wanted either bool or string %s %s", expr.id, outType.toString());
        }
        return new CompiledProgramBuilder(env, ast, expr);
    }

    public CompiledProgram build(ProgramOption... opts) {
        Program program = env.program(ast, opts);
        return new CompiledProgram(
                env,
                program,
                source
        );
    }
}