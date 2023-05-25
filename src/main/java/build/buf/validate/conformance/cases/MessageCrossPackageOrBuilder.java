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
// source: buf/validate/conformance/cases/messages.proto

package build.buf.validate.conformance.cases;

public interface MessageCrossPackageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MessageCrossPackage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   * @return Whether the val field is set.
   */
  boolean hasVal();
  /**
   * <code>.buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   * @return The val.
   */
  build.buf.validate.conformance.cases.other_package.Embed getVal();
  /**
   * <code>.buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  build.buf.validate.conformance.cases.other_package.EmbedOrBuilder getValOrBuilder();
}
