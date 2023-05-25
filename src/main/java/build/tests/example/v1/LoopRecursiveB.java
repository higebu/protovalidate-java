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

/**
 * Protobuf type {@code tests.example.v1.LoopRecursiveB}
 */
public final class LoopRecursiveB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tests.example.v1.LoopRecursiveB)
    LoopRecursiveBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoopRecursiveB.newBuilder() to construct.
  private LoopRecursiveB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoopRecursiveB() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoopRecursiveB();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.tests.example.v1.ValidationsProto.internal_static_tests_example_v1_LoopRecursiveB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.tests.example.v1.ValidationsProto.internal_static_tests_example_v1_LoopRecursiveB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.tests.example.v1.LoopRecursiveB.class, build.tests.example.v1.LoopRecursiveB.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private build.tests.example.v1.LoopRecursiveA a_;
  /**
   * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
   * @return Whether the a field is set.
   */
  @java.lang.Override
  public boolean hasA() {
    return a_ != null;
  }
  /**
   * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
   * @return The a.
   */
  @java.lang.Override
  public build.tests.example.v1.LoopRecursiveA getA() {
    return a_ == null ? build.tests.example.v1.LoopRecursiveA.getDefaultInstance() : a_;
  }
  /**
   * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
   */
  @java.lang.Override
  public build.tests.example.v1.LoopRecursiveAOrBuilder getAOrBuilder() {
    return a_ == null ? build.tests.example.v1.LoopRecursiveA.getDefaultInstance() : a_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (a_ != null) {
      output.writeMessage(1, getA());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getA());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.tests.example.v1.LoopRecursiveB)) {
      return super.equals(obj);
    }
    build.tests.example.v1.LoopRecursiveB other = (build.tests.example.v1.LoopRecursiveB) obj;

    if (hasA() != other.hasA()) return false;
    if (hasA()) {
      if (!getA()
          .equals(other.getA())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasA()) {
      hash = (37 * hash) + A_FIELD_NUMBER;
      hash = (53 * hash) + getA().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.tests.example.v1.LoopRecursiveB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.tests.example.v1.LoopRecursiveB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.LoopRecursiveB parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.tests.example.v1.LoopRecursiveB prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tests.example.v1.LoopRecursiveB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tests.example.v1.LoopRecursiveB)
      build.tests.example.v1.LoopRecursiveBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.tests.example.v1.ValidationsProto.internal_static_tests_example_v1_LoopRecursiveB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.tests.example.v1.ValidationsProto.internal_static_tests_example_v1_LoopRecursiveB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.tests.example.v1.LoopRecursiveB.class, build.tests.example.v1.LoopRecursiveB.Builder.class);
    }

    // Construct using build.tests.example.v1.LoopRecursiveB.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      a_ = null;
      if (aBuilder_ != null) {
        aBuilder_.dispose();
        aBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.tests.example.v1.ValidationsProto.internal_static_tests_example_v1_LoopRecursiveB_descriptor;
    }

    @java.lang.Override
    public build.tests.example.v1.LoopRecursiveB getDefaultInstanceForType() {
      return build.tests.example.v1.LoopRecursiveB.getDefaultInstance();
    }

    @java.lang.Override
    public build.tests.example.v1.LoopRecursiveB build() {
      build.tests.example.v1.LoopRecursiveB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.tests.example.v1.LoopRecursiveB buildPartial() {
      build.tests.example.v1.LoopRecursiveB result = new build.tests.example.v1.LoopRecursiveB(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.tests.example.v1.LoopRecursiveB result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.a_ = aBuilder_ == null
            ? a_
            : aBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.tests.example.v1.LoopRecursiveB) {
        return mergeFrom((build.tests.example.v1.LoopRecursiveB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.tests.example.v1.LoopRecursiveB other) {
      if (other == build.tests.example.v1.LoopRecursiveB.getDefaultInstance()) return this;
      if (other.hasA()) {
        mergeA(other.getA());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private build.tests.example.v1.LoopRecursiveA a_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.tests.example.v1.LoopRecursiveA, build.tests.example.v1.LoopRecursiveA.Builder, build.tests.example.v1.LoopRecursiveAOrBuilder> aBuilder_;
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     * @return Whether the a field is set.
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     * @return The a.
     */
    public build.tests.example.v1.LoopRecursiveA getA() {
      if (aBuilder_ == null) {
        return a_ == null ? build.tests.example.v1.LoopRecursiveA.getDefaultInstance() : a_;
      } else {
        return aBuilder_.getMessage();
      }
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public Builder setA(build.tests.example.v1.LoopRecursiveA value) {
      if (aBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        a_ = value;
      } else {
        aBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public Builder setA(
        build.tests.example.v1.LoopRecursiveA.Builder builderForValue) {
      if (aBuilder_ == null) {
        a_ = builderForValue.build();
      } else {
        aBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public Builder mergeA(build.tests.example.v1.LoopRecursiveA value) {
      if (aBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          a_ != null &&
          a_ != build.tests.example.v1.LoopRecursiveA.getDefaultInstance()) {
          getABuilder().mergeFrom(value);
        } else {
          a_ = value;
        }
      } else {
        aBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public Builder clearA() {
      bitField0_ = (bitField0_ & ~0x00000001);
      a_ = null;
      if (aBuilder_ != null) {
        aBuilder_.dispose();
        aBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public build.tests.example.v1.LoopRecursiveA.Builder getABuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAFieldBuilder().getBuilder();
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    public build.tests.example.v1.LoopRecursiveAOrBuilder getAOrBuilder() {
      if (aBuilder_ != null) {
        return aBuilder_.getMessageOrBuilder();
      } else {
        return a_ == null ?
            build.tests.example.v1.LoopRecursiveA.getDefaultInstance() : a_;
      }
    }
    /**
     * <code>.tests.example.v1.LoopRecursiveA a = 1 [json_name = "a"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.tests.example.v1.LoopRecursiveA, build.tests.example.v1.LoopRecursiveA.Builder, build.tests.example.v1.LoopRecursiveAOrBuilder> 
        getAFieldBuilder() {
      if (aBuilder_ == null) {
        aBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.tests.example.v1.LoopRecursiveA, build.tests.example.v1.LoopRecursiveA.Builder, build.tests.example.v1.LoopRecursiveAOrBuilder>(
                getA(),
                getParentForChildren(),
                isClean());
        a_ = null;
      }
      return aBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tests.example.v1.LoopRecursiveB)
  }

  // @@protoc_insertion_point(class_scope:tests.example.v1.LoopRecursiveB)
  private static final build.tests.example.v1.LoopRecursiveB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.tests.example.v1.LoopRecursiveB();
  }

  public static build.tests.example.v1.LoopRecursiveB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoopRecursiveB>
      PARSER = new com.google.protobuf.AbstractParser<LoopRecursiveB>() {
    @java.lang.Override
    public LoopRecursiveB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LoopRecursiveB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoopRecursiveB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.tests.example.v1.LoopRecursiveB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

