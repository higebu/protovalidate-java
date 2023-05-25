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
// source: buf/validate/expression.proto

package build.buf.validate;

public interface ViolationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.Violations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<build.buf.validate.Violation> 
      getViolationsList();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  build.buf.validate.Violation getViolations(int index);
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<? extends build.buf.validate.ViolationOrBuilder> 
      getViolationsOrBuilderList();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  build.buf.validate.ViolationOrBuilder getViolationsOrBuilder(
      int index);
}
