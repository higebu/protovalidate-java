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
// source: buf/validate/conformance/cases/oneofs.proto

package build.buf.validate.conformance.cases;

public interface OneofIgnoreEmptyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.OneofIgnoreEmpty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return Whether the x field is set.
   */
  boolean hasX();
  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return The x.
   */
  java.lang.String getX();
  /**
   * <code>string x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return The bytes for x.
   */
  com.google.protobuf.ByteString
      getXBytes();

  /**
   * <code>bytes y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return Whether the y field is set.
   */
  boolean hasY();
  /**
   * <code>bytes y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return The y.
   */
  com.google.protobuf.ByteString getY();

  /**
   * <code>int32 z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   * @return Whether the z field is set.
   */
  boolean hasZ();
  /**
   * <code>int32 z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   * @return The z.
   */
  int getZ();

  build.buf.validate.conformance.cases.OneofIgnoreEmpty.OCase getOCase();
}
