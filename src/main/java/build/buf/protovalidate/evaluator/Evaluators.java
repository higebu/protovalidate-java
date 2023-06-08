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

package build.buf.protovalidate.evaluator;

import build.buf.protovalidate.errors.ValidationError;
import com.google.protobuf.DynamicMessage;

import java.util.List;

class Evaluators implements Evaluator {
    final List<Evaluator> evaluators;

    public Evaluators(List<Evaluator> evaluators) {
        this.evaluators = evaluators;
    }

    @Override
    public boolean tautology() {
        for (Evaluator eval : evaluators) {
            if (!eval.tautology()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void evaluate(DynamicMessage val, boolean failFast) throws ValidationError {
        for (Evaluator evaluator : evaluators) {
            evaluator.evaluate(val, failFast);
            // TODO: handle failFast condition
        }
    }

    @Override
    public void append(Evaluator eval) {
        if (eval != null && !eval.tautology()) {
            this.evaluators.add(eval);
        }
    }

    public void append(MessageEvaluator eval) {
        if (eval != null && !eval.tautology()) {
            this.evaluators.add(eval);
        }
    }
}
