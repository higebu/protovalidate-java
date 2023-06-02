// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/expression.proto

package build.buf.validate;

/**
 * <pre>
 * `Violation` represents a single instance where a validation rule, expressed
 * as a `Constraint`, was not met. It provides information about the field that
 * caused the violation, the specific constraint that wasn't fulfilled, and a
 * human-readable error message.
 *
 * ```json
 * {
 *   "fieldPath": "bar",
 *   "constraintId": "foo.bar",
 *   "message": "bar must be greater than 0"
 * }
 * ```
 * </pre>
 *
 * Protobuf type {@code buf.validate.Violation}
 */
public final class Violation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.Violation)
    ViolationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Violation.newBuilder() to construct.
  private Violation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Violation() {
    fieldPath_ = "";
    constraintId_ = "";
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Violation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ExpressionProto.internal_static_buf_validate_Violation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ExpressionProto.internal_static_buf_validate_Violation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.Violation.class, build.buf.validate.Violation.Builder.class);
  }

  public static final int FIELD_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldPath_ = "";
  /**
   * <pre>
   * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
   * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  @java.lang.Override
  public java.lang.String getFieldPath() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
   * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldPathBytes() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSTRAINT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object constraintId_ = "";
  /**
   * <pre>
   * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
   * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
   * </pre>
   *
   * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
   * @return The constraintId.
   */
  @java.lang.Override
  public java.lang.String getConstraintId() {
    java.lang.Object ref = constraintId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      constraintId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
   * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
   * </pre>
   *
   * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
   * @return The bytes for constraintId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConstraintIdBytes() {
    java.lang.Object ref = constraintId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      constraintId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * `message` is a human-readable error message that describes the nature of the violation.
   * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `message` is a human-readable error message that describes the nature of the violation.
   * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(constraintId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, constraintId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(constraintId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, constraintId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
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
    if (!(obj instanceof build.buf.validate.Violation)) {
      return super.equals(obj);
    }
    build.buf.validate.Violation other = (build.buf.validate.Violation) obj;

    if (!getFieldPath()
        .equals(other.getFieldPath())) return false;
    if (!getConstraintId()
        .equals(other.getConstraintId())) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + FIELD_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFieldPath().hashCode();
    hash = (37 * hash) + CONSTRAINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConstraintId().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.Violation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.Violation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.Violation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.Violation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.Violation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.Violation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.Violation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.Violation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.Violation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.Violation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.Violation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.Violation parseFrom(
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
  public static Builder newBuilder(build.buf.validate.Violation prototype) {
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
   * <pre>
   * `Violation` represents a single instance where a validation rule, expressed
   * as a `Constraint`, was not met. It provides information about the field that
   * caused the violation, the specific constraint that wasn't fulfilled, and a
   * human-readable error message.
   *
   * ```json
   * {
   *   "fieldPath": "bar",
   *   "constraintId": "foo.bar",
   *   "message": "bar must be greater than 0"
   * }
   * ```
   * </pre>
   *
   * Protobuf type {@code buf.validate.Violation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.Violation)
      build.buf.validate.ViolationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ExpressionProto.internal_static_buf_validate_Violation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ExpressionProto.internal_static_buf_validate_Violation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.Violation.class, build.buf.validate.Violation.Builder.class);
    }

    // Construct using build.buf.validate.Violation.newBuilder()
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
      fieldPath_ = "";
      constraintId_ = "";
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ExpressionProto.internal_static_buf_validate_Violation_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.Violation getDefaultInstanceForType() {
      return build.buf.validate.Violation.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.Violation build() {
      build.buf.validate.Violation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.Violation buildPartial() {
      build.buf.validate.Violation result = new build.buf.validate.Violation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.Violation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldPath_ = fieldPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.constraintId_ = constraintId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
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
      if (other instanceof build.buf.validate.Violation) {
        return mergeFrom((build.buf.validate.Violation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.Violation other) {
      if (other == build.buf.validate.Violation.getDefaultInstance()) return this;
      if (!other.getFieldPath().isEmpty()) {
        fieldPath_ = other.fieldPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getConstraintId().isEmpty()) {
        constraintId_ = other.constraintId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              fieldPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              constraintId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object fieldPath_ = "";
    /**
     * <pre>
     * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
     * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return The fieldPath.
     */
    public java.lang.String getFieldPath() {
      java.lang.Object ref = fieldPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
     * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return The bytes for fieldPath.
     */
    public com.google.protobuf.ByteString
        getFieldPathBytes() {
      java.lang.Object ref = fieldPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
     * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @param value The fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
     * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldPath() {
      fieldPath_ = getDefaultInstance().getFieldPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
     * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @param value The bytes for fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object constraintId_ = "";
    /**
     * <pre>
     * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
     * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
     * </pre>
     *
     * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
     * @return The constraintId.
     */
    public java.lang.String getConstraintId() {
      java.lang.Object ref = constraintId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        constraintId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
     * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
     * </pre>
     *
     * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
     * @return The bytes for constraintId.
     */
    public com.google.protobuf.ByteString
        getConstraintIdBytes() {
      java.lang.Object ref = constraintId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        constraintId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
     * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
     * </pre>
     *
     * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
     * @param value The constraintId to set.
     * @return This builder for chaining.
     */
    public Builder setConstraintId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      constraintId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
     * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
     * </pre>
     *
     * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConstraintId() {
      constraintId_ = getDefaultInstance().getConstraintId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
     * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
     * </pre>
     *
     * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
     * @param value The bytes for constraintId to set.
     * @return This builder for chaining.
     */
    public Builder setConstraintIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      constraintId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * `message` is a human-readable error message that describes the nature of the violation.
     * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `message` is a human-readable error message that describes the nature of the violation.
     * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `message` is a human-readable error message that describes the nature of the violation.
     * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `message` is a human-readable error message that describes the nature of the violation.
     * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `message` is a human-readable error message that describes the nature of the violation.
     * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.Violation)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.Violation)
  private static final build.buf.validate.Violation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.Violation();
  }

  public static build.buf.validate.Violation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Violation>
      PARSER = new com.google.protobuf.AbstractParser<Violation>() {
    @java.lang.Override
    public Violation parsePartialFrom(
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

  public static com.google.protobuf.Parser<Violation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Violation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.Violation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

