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

public interface MessageExpressionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.custom_constraints.MessageExpressions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 a = 1 [json_name = "a"];</code>
   * @return The a.
   */
  int getA();

  /**
   * <code>int32 b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  int getB();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum c = 3 [json_name = "c"];</code>
   * @return The enum numeric value on the wire for c.
   */
  int getCValue();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum c = 3 [json_name = "c"];</code>
   * @return The c.
   */
  build.buf.validate.conformance.cases.custom_constraints.Enum getC();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum d = 4 [json_name = "d"];</code>
   * @return The enum numeric value on the wire for d.
   */
  int getDValue();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.Enum d = 4 [json_name = "d"];</code>
   * @return The d.
   */
  build.buf.validate.conformance.cases.custom_constraints.Enum getD();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested e = 5 [json_name = "e"];</code>
   * @return Whether the e field is set.
   */
  boolean hasE();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested e = 5 [json_name = "e"];</code>
   * @return The e.
   */
  build.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested getE();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested e = 5 [json_name = "e"];</code>
   */
  build.buf.validate.conformance.cases.custom_constraints.MessageExpressions.NestedOrBuilder getEOrBuilder();

  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested f = 6 [json_name = "f"];</code>
   * @return Whether the f field is set.
   */
  boolean hasF();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested f = 6 [json_name = "f"];</code>
   * @return The f.
   */
  build.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested getF();
  /**
   * <code>.buf.validate.conformance.cases.custom_constraints.MessageExpressions.Nested f = 6 [json_name = "f"];</code>
   */
  build.buf.validate.conformance.cases.custom_constraints.MessageExpressions.NestedOrBuilder getFOrBuilder();
}
