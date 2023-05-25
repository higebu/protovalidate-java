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
// source: tests/example/v1/legacy.proto

package build.tests.example.v1;

/**
 * Protobuf type {@code tests.example.v1.LegacySimple}
 */
public final class LegacySimple extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tests.example.v1.LegacySimple)
    LegacySimpleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LegacySimple.newBuilder() to construct.
  private LegacySimple(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LegacySimple() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LegacySimple();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.tests.example.v1.LegacyProto.internal_static_tests_example_v1_LegacySimple_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.tests.example.v1.LegacyProto.internal_static_tests_example_v1_LegacySimple_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.tests.example.v1.LegacySimple.class, build.tests.example.v1.LegacySimple.Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private int x_ = 0;
  /**
   * <code>int32 x = 1 [json_name = "x", (.validate.rules) = { ... }</code>
   * @return The x.
   */
  @java.lang.Override
  public int getX() {
    return x_;
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
    if (x_ != 0) {
      output.writeInt32(1, x_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, x_);
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
    if (!(obj instanceof build.tests.example.v1.LegacySimple)) {
      return super.equals(obj);
    }
    build.tests.example.v1.LegacySimple other = (build.tests.example.v1.LegacySimple) obj;

    if (getX()
        != other.getX()) return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + getX();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.tests.example.v1.LegacySimple parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.tests.example.v1.LegacySimple parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.tests.example.v1.LegacySimple parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.LegacySimple parseFrom(
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
  public static Builder newBuilder(build.tests.example.v1.LegacySimple prototype) {
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
   * Protobuf type {@code tests.example.v1.LegacySimple}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tests.example.v1.LegacySimple)
      build.tests.example.v1.LegacySimpleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.tests.example.v1.LegacyProto.internal_static_tests_example_v1_LegacySimple_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.tests.example.v1.LegacyProto.internal_static_tests_example_v1_LegacySimple_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.tests.example.v1.LegacySimple.class, build.tests.example.v1.LegacySimple.Builder.class);
    }

    // Construct using build.tests.example.v1.LegacySimple.newBuilder()
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
      x_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.tests.example.v1.LegacyProto.internal_static_tests_example_v1_LegacySimple_descriptor;
    }

    @java.lang.Override
    public build.tests.example.v1.LegacySimple getDefaultInstanceForType() {
      return build.tests.example.v1.LegacySimple.getDefaultInstance();
    }

    @java.lang.Override
    public build.tests.example.v1.LegacySimple build() {
      build.tests.example.v1.LegacySimple result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.tests.example.v1.LegacySimple buildPartial() {
      build.tests.example.v1.LegacySimple result = new build.tests.example.v1.LegacySimple(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.tests.example.v1.LegacySimple result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.x_ = x_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.tests.example.v1.LegacySimple) {
        return mergeFrom((build.tests.example.v1.LegacySimple)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.tests.example.v1.LegacySimple other) {
      if (other == build.tests.example.v1.LegacySimple.getDefaultInstance()) return this;
      if (other.getX() != 0) {
        setX(other.getX());
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
            case 8: {
              x_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int x_ ;
    /**
     * <code>int32 x = 1 [json_name = "x", (.validate.rules) = { ... }</code>
     * @return The x.
     */
    @java.lang.Override
    public int getX() {
      return x_;
    }
    /**
     * <code>int32 x = 1 [json_name = "x", (.validate.rules) = { ... }</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(int value) {

      x_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 x = 1 [json_name = "x", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000001);
      x_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:tests.example.v1.LegacySimple)
  }

  // @@protoc_insertion_point(class_scope:tests.example.v1.LegacySimple)
  private static final build.tests.example.v1.LegacySimple DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.tests.example.v1.LegacySimple();
  }

  public static build.tests.example.v1.LegacySimple getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LegacySimple>
      PARSER = new com.google.protobuf.AbstractParser<LegacySimple>() {
    @java.lang.Override
    public LegacySimple parsePartialFrom(
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

  public static com.google.protobuf.Parser<LegacySimple> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LegacySimple> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.tests.example.v1.LegacySimple getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

