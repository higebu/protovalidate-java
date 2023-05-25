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
// source: buf/validate/conformance/harness/harness.proto

package build.buf.validate.conformance.harness;

public interface TestResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.TestResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   * @return Whether the validationError field is set.
   */
  boolean hasValidationError();
  /**
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   * @return The validationError.
   */
  build.buf.validate.Violations getValidationError();
  /**
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   */
  build.buf.validate.ViolationsOrBuilder getValidationErrorOrBuilder();

  /**
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return Whether the compilationError field is set.
   */
  boolean hasCompilationError();
  /**
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return The compilationError.
   */
  java.lang.String getCompilationError();
  /**
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return The bytes for compilationError.
   */
  com.google.protobuf.ByteString
      getCompilationErrorBytes();

  /**
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return Whether the runtimeError field is set.
   */
  boolean hasRuntimeError();
  /**
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return The runtimeError.
   */
  java.lang.String getRuntimeError();
  /**
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return The bytes for runtimeError.
   */
  com.google.protobuf.ByteString
      getRuntimeErrorBytes();

  /**
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return Whether the unexpectedError field is set.
   */
  boolean hasUnexpectedError();
  /**
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return The unexpectedError.
   */
  java.lang.String getUnexpectedError();
  /**
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return The bytes for unexpectedError.
   */
  com.google.protobuf.ByteString
      getUnexpectedErrorBytes();

  build.buf.validate.conformance.harness.TestResult.ResultCase getResultCase();
}
