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

/**
 * Protobuf type {@code buf.validate.conformance.cases.RepeatedEnumNotIn}
 */
public final class RepeatedEnumNotIn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RepeatedEnumNotIn)
    RepeatedEnumNotInOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedEnumNotIn.newBuilder() to construct.
  private RepeatedEnumNotIn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedEnumNotIn() {
    val_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatedEnumNotIn();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedEnumNotIn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedEnumNotIn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RepeatedEnumNotIn.class, build.buf.validate.conformance.cases.RepeatedEnumNotIn.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> val_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, build.buf.validate.conformance.cases.AnEnum> val_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, build.buf.validate.conformance.cases.AnEnum>() {
            public build.buf.validate.conformance.cases.AnEnum convert(java.lang.Integer from) {
              build.buf.validate.conformance.cases.AnEnum result = build.buf.validate.conformance.cases.AnEnum.forNumber(from);
              return result == null ? build.buf.validate.conformance.cases.AnEnum.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  @java.lang.Override
  public java.util.List<build.buf.validate.conformance.cases.AnEnum> getValList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, build.buf.validate.conformance.cases.AnEnum>(val_, val_converter_);
  }
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  @java.lang.Override
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  @java.lang.Override
  public build.buf.validate.conformance.cases.AnEnum getVal(int index) {
    return val_converter_.convert(val_.get(index));
  }
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the enum numeric values on the wire for val.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getValValueList() {
    return val_;
  }
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of val at the given index.
   */
  @java.lang.Override
  public int getValValue(int index) {
    return val_.get(index);
  }
  private int valMemoizedSerializedSize;

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
    getSerializedSize();
    if (getValList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valMemoizedSerializedSize);
    }
    for (int i = 0; i < val_.size(); i++) {
      output.writeEnumNoTag(val_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < val_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(val_.get(i));
      }
      size += dataSize;
      if (!getValList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }valMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof build.buf.validate.conformance.cases.RepeatedEnumNotIn)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RepeatedEnumNotIn other = (build.buf.validate.conformance.cases.RepeatedEnumNotIn) obj;

    if (!val_.equals(other.val_)) return false;
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
    if (getValCount() > 0) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + val_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.RepeatedEnumNotIn prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.RepeatedEnumNotIn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RepeatedEnumNotIn)
      build.buf.validate.conformance.cases.RepeatedEnumNotInOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedEnumNotIn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedEnumNotIn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RepeatedEnumNotIn.class, build.buf.validate.conformance.cases.RepeatedEnumNotIn.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RepeatedEnumNotIn.newBuilder()
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
      val_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedEnumNotIn_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedEnumNotIn getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RepeatedEnumNotIn.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedEnumNotIn build() {
      build.buf.validate.conformance.cases.RepeatedEnumNotIn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedEnumNotIn buildPartial() {
      build.buf.validate.conformance.cases.RepeatedEnumNotIn result = new build.buf.validate.conformance.cases.RepeatedEnumNotIn(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.conformance.cases.RepeatedEnumNotIn result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        val_ = java.util.Collections.unmodifiableList(val_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.val_ = val_;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RepeatedEnumNotIn result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.RepeatedEnumNotIn) {
        return mergeFrom((build.buf.validate.conformance.cases.RepeatedEnumNotIn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RepeatedEnumNotIn other) {
      if (other == build.buf.validate.conformance.cases.RepeatedEnumNotIn.getDefaultInstance()) return this;
      if (!other.val_.isEmpty()) {
        if (val_.isEmpty()) {
          val_ = other.val_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValIsMutable();
          val_.addAll(other.val_);
        }
        onChanged();
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
              int tmpRaw = input.readEnum();
              ensureValIsMutable();
              val_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureValIsMutable();
                val_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> val_ =
      java.util.Collections.emptyList();
    private void ensureValIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        val_ = new java.util.ArrayList<java.lang.Integer>(val_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return A list containing the val.
     */
    public java.util.List<build.buf.validate.conformance.cases.AnEnum> getValList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, build.buf.validate.conformance.cases.AnEnum>(val_, val_converter_);
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The count of val.
     */
    public int getValCount() {
      return val_.size();
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index of the element to return.
     * @return The val at the given index.
     */
    public build.buf.validate.conformance.cases.AnEnum getVal(int index) {
      return val_converter_.convert(val_.get(index));
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(
        int index, build.buf.validate.conformance.cases.AnEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValIsMutable();
      val_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to add.
     * @return This builder for chaining.
     */
    public Builder addVal(build.buf.validate.conformance.cases.AnEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValIsMutable();
      val_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param values The val to add.
     * @return This builder for chaining.
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends build.buf.validate.conformance.cases.AnEnum> values) {
      ensureValIsMutable();
      for (build.buf.validate.conformance.cases.AnEnum value : values) {
        val_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      val_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return A list containing the enum numeric values on the wire for val.
     */
    public java.util.List<java.lang.Integer>
    getValValueList() {
      return java.util.Collections.unmodifiableList(val_);
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of val at the given index.
     */
    public int getValValue(int index) {
      return val_.get(index);
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for val to set.
     * @return This builder for chaining.
     */
    public Builder setValValue(
        int index, int value) {
      ensureValIsMutable();
      val_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The enum numeric value on the wire for val to add.
     * @return This builder for chaining.
     */
    public Builder addValValue(int value) {
      ensureValIsMutable();
      val_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param values The enum numeric values on the wire for val to add.
     * @return This builder for chaining.
     */
    public Builder addAllValValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureValIsMutable();
      for (int value : values) {
        val_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RepeatedEnumNotIn)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RepeatedEnumNotIn)
  private static final build.buf.validate.conformance.cases.RepeatedEnumNotIn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RepeatedEnumNotIn();
  }

  public static build.buf.validate.conformance.cases.RepeatedEnumNotIn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepeatedEnumNotIn>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedEnumNotIn>() {
    @java.lang.Override
    public RepeatedEnumNotIn parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepeatedEnumNotIn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedEnumNotIn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RepeatedEnumNotIn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

