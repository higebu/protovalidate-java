// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/wkt_wrappers.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.WrapperBool}
 */
public final class WrapperBool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.WrapperBool)
    WrapperBoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WrapperBool.newBuilder() to construct.
  private WrapperBool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WrapperBool() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WrapperBool();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperBool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperBool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.WrapperBool.class, build.buf.validate.conformance.cases.WrapperBool.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue val_;
  /**
   * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return val_ != null;
  }
  /**
   * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getVal() {
    return val_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : val_;
  }
  /**
   * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getValOrBuilder() {
    return val_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : val_;
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
    if (val_ != null) {
      output.writeMessage(1, getVal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVal());
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
    if (!(obj instanceof build.buf.validate.conformance.cases.WrapperBool)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.WrapperBool other = (build.buf.validate.conformance.cases.WrapperBool) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
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
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.WrapperBool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.WrapperBool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.WrapperBool parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.WrapperBool prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.WrapperBool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.WrapperBool)
      build.buf.validate.conformance.cases.WrapperBoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperBool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperBool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.WrapperBool.class, build.buf.validate.conformance.cases.WrapperBool.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.WrapperBool.newBuilder()
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
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperBool_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperBool getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.WrapperBool.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperBool build() {
      build.buf.validate.conformance.cases.WrapperBool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperBool buildPartial() {
      build.buf.validate.conformance.cases.WrapperBool result = new build.buf.validate.conformance.cases.WrapperBool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.WrapperBool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = valBuilder_ == null
            ? val_
            : valBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.WrapperBool) {
        return mergeFrom((build.buf.validate.conformance.cases.WrapperBool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.WrapperBool other) {
      if (other == build.buf.validate.conformance.cases.WrapperBool.getDefaultInstance()) return this;
      if (other.hasVal()) {
        mergeVal(other.getVal());
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
                  getValFieldBuilder().getBuilder(),
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

    private com.google.protobuf.BoolValue val_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> valBuilder_;
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    public com.google.protobuf.BoolValue getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(com.google.protobuf.BoolValue value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
      } else {
        valBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeVal(com.google.protobuf.BoolValue value) {
      if (valBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          val_ != null &&
          val_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getValBuilder().mergeFrom(value);
        } else {
          val_ = value;
        }
      } else {
        valBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BoolValue.Builder getValBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.google.protobuf.BoolValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.WrapperBool)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.WrapperBool)
  private static final build.buf.validate.conformance.cases.WrapperBool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.WrapperBool();
  }

  public static build.buf.validate.conformance.cases.WrapperBool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WrapperBool>
      PARSER = new com.google.protobuf.AbstractParser<WrapperBool>() {
    @java.lang.Override
    public WrapperBool parsePartialFrom(
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

  public static com.google.protobuf.Parser<WrapperBool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WrapperBool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.WrapperBool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

