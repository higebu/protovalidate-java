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
// source: buf/validate/conformance/cases/maps.proto

package build.buf.validate.conformance.cases;

public interface MultipleMapsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MultipleMaps)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  int getFirstCount();
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  boolean containsFirst(
      int key);
  /**
   * Use {@link #getFirstMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.String>
  getFirst();
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.lang.String>
  getFirstMap();
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  /* nullable */
java.lang.String getFirstOrDefault(
      int key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  java.lang.String getFirstOrThrow(
      int key);

  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  int getSecondCount();
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  boolean containsSecond(
      int key);
  /**
   * Use {@link #getSecondMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Boolean>
  getSecond();
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Boolean>
  getSecondMap();
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  boolean getSecondOrDefault(
      int key,
      boolean defaultValue);
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  boolean getSecondOrThrow(
      int key);

  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  int getThirdCount();
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  boolean containsThird(
      int key);
  /**
   * Use {@link #getThirdMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Boolean>
  getThird();
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Boolean>
  getThirdMap();
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  boolean getThirdOrDefault(
      int key,
      boolean defaultValue);
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  boolean getThirdOrThrow(
      int key);
}
