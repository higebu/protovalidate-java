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
 * Protobuf type {@code buf.validate.conformance.cases.RepeatedMax}
 */
public final class RepeatedMax extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RepeatedMax)
    RepeatedMaxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedMax.newBuilder() to construct.
  private RepeatedMax(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedMax() {
    val_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatedMax();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedMax_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedMax_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RepeatedMax.class, build.buf.validate.conformance.cases.RepeatedMax.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList val_;
  /**
   * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getValList() {
    return val_;
  }
  /**
   * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  public int getValCount() {
    return val_.size();
  }
  /**
   * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  public double getVal(int index) {
    return val_.getDouble(index);
  }
  private int valMemoizedSerializedSize = -1;

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
      output.writeDoubleNoTag(val_.getDouble(i));
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
      dataSize = 8 * getValList().size();
      size += dataSize;
      if (!getValList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof build.buf.validate.conformance.cases.RepeatedMax)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RepeatedMax other = (build.buf.validate.conformance.cases.RepeatedMax) obj;

    if (!getValList()
        .equals(other.getValList())) return false;
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
      hash = (53 * hash) + getValList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RepeatedMax parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RepeatedMax parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RepeatedMax parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.RepeatedMax prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.RepeatedMax}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RepeatedMax)
      build.buf.validate.conformance.cases.RepeatedMaxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedMax_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedMax_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RepeatedMax.class, build.buf.validate.conformance.cases.RepeatedMax.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RepeatedMax.newBuilder()
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
      val_ = emptyDoubleList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RepeatedProto.internal_static_buf_validate_conformance_cases_RepeatedMax_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedMax getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RepeatedMax.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedMax build() {
      build.buf.validate.conformance.cases.RepeatedMax result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RepeatedMax buildPartial() {
      build.buf.validate.conformance.cases.RepeatedMax result = new build.buf.validate.conformance.cases.RepeatedMax(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.conformance.cases.RepeatedMax result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        val_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.val_ = val_;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RepeatedMax result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.RepeatedMax) {
        return mergeFrom((build.buf.validate.conformance.cases.RepeatedMax)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RepeatedMax other) {
      if (other == build.buf.validate.conformance.cases.RepeatedMax.getDefaultInstance()) return this;
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
            case 9: {
              double v = input.readDouble();
              ensureValIsMutable();
              val_.addDouble(v);
              break;
            } // case 9
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureValIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                val_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.DoubleList val_ = emptyDoubleList();
    private void ensureValIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        val_ = mutableCopy(val_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return A list containing the val.
     */
    public java.util.List<java.lang.Double>
        getValList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(val_) : val_;
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The count of val.
     */
    public int getValCount() {
      return val_.size();
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index of the element to return.
     * @return The val at the given index.
     */
    public double getVal(int index) {
      return val_.getDouble(index);
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(
        int index, double value) {

      ensureValIsMutable();
      val_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to add.
     * @return This builder for chaining.
     */
    public Builder addVal(double value) {

      ensureValIsMutable();
      val_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param values The val to add.
     * @return This builder for chaining.
     */
    public Builder addAllVal(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureValIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, val_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      val_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RepeatedMax)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RepeatedMax)
  private static final build.buf.validate.conformance.cases.RepeatedMax DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RepeatedMax();
  }

  public static build.buf.validate.conformance.cases.RepeatedMax getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepeatedMax>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedMax>() {
    @java.lang.Override
    public RepeatedMax parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepeatedMax> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedMax> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RepeatedMax getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

