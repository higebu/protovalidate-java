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
// source: tests/example/v1/validations.proto

package build.tests.example.v1;

public interface MsgHasRepeatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tests.example.v1.MsgHasRepeated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated float x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return A list containing the x.
   */
  java.util.List<java.lang.Float> getXList();
  /**
   * <code>repeated float x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @return The count of x.
   */
  int getXCount();
  /**
   * <code>repeated float x = 1 [json_name = "x", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The x at the given index.
   */
  float getX(int index);

  /**
   * <code>repeated string y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return A list containing the y.
   */
  java.util.List<java.lang.String>
      getYList();
  /**
   * <code>repeated string y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @return The count of y.
   */
  int getYCount();
  /**
   * <code>repeated string y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The y at the given index.
   */
  java.lang.String getY(int index);
  /**
   * <code>repeated string y = 2 [json_name = "y", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the y at the given index.
   */
  com.google.protobuf.ByteString
      getYBytes(int index);

  /**
   * <code>repeated .tests.example.v1.HasMsgExprs z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<build.tests.example.v1.HasMsgExprs> 
      getZList();
  /**
   * <code>repeated .tests.example.v1.HasMsgExprs z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   */
  build.tests.example.v1.HasMsgExprs getZ(int index);
  /**
   * <code>repeated .tests.example.v1.HasMsgExprs z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   */
  int getZCount();
  /**
   * <code>repeated .tests.example.v1.HasMsgExprs z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends build.tests.example.v1.HasMsgExprsOrBuilder> 
      getZOrBuilderList();
  /**
   * <code>repeated .tests.example.v1.HasMsgExprs z = 3 [json_name = "z", (.buf.validate.field) = { ... }</code>
   */
  build.tests.example.v1.HasMsgExprsOrBuilder getZOrBuilder(
      int index);
}
