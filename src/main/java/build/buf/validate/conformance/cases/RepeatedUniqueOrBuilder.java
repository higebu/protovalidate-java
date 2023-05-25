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
// source: buf/validate/conformance/cases/repeated.proto

package build.buf.validate.conformance.cases;

public interface RepeatedUniqueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RepeatedUnique)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  java.util.List<java.lang.String>
      getValList();
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  int getValCount();
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  java.lang.String getVal(int index);
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the val at the given index.
   */
  com.google.protobuf.ByteString
      getValBytes(int index);
}
