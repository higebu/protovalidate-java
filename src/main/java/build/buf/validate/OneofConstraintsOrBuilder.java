// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

package build.buf.validate;

public interface OneofConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.OneofConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *`required` is an optional boolean attribute that ensures that
   *exactly one of the field options in a oneof is set; validation fails if
   *no fields in the oneof are set.
   *
   *```proto
   *message MyMessage {
   *  oneof value {
   *    // The field `a` or `b` must be set.
   *    option (buf.validate.oneof).required = true;
   *    optional string a = 1;
   *    optional string b = 2;
   *  }
   *}
   *```
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return Whether the required field is set.
   */
  boolean hasRequired();
  /**
   * <pre>
   *`required` is an optional boolean attribute that ensures that
   *exactly one of the field options in a oneof is set; validation fails if
   *no fields in the oneof are set.
   *
   *```proto
   *message MyMessage {
   *  oneof value {
   *    // The field `a` or `b` must be set.
   *    option (buf.validate.oneof).required = true;
   *    optional string a = 1;
   *    optional string b = 2;
   *  }
   *}
   *```
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return The required.
   */
  boolean getRequired();
}
