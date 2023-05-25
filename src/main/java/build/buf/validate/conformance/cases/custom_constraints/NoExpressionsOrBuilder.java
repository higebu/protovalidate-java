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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto

package build.buf.validate.conformance.cases.custom_constraints;

public interface NoExpressionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.custom_constraints.NoExpressions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 a = 1 [json_name = "a"];</code>
   * @return The a.
   */
  int getA();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b"];</code>
   * @return The enum numeric value on the wire for b.
   */
  int getBValue();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  build.buf.validate.conformance.cases.custom_constraints.Enum getB();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   * @return Whether the c field is set.
   */
  boolean hasC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   * @return The c.
   */
  build.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested getC();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.NoExpressions.Nested c = 3 [json_name = "c"];</code>
   */
  build.buf.validate.conformance.cases.custom_constraints.NoExpressions.NestedOrBuilder getCOrBuilder();
}
