// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

package build.buf.validate;

public interface TimestampRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.TimestampRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `const` dictates that this field, of the `google.protobuf.Timestamp` type, must exactly match the specified value. If the field value doesn't correspond to the specified timestamp, an error message will be generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must equal 2023-05-03T10:00:00Z
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.const = {seconds: 1727998800}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` dictates that this field, of the `google.protobuf.Timestamp` type, must exactly match the specified value. If the field value doesn't correspond to the specified timestamp, an error message will be generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must equal 2023-05-03T10:00:00Z
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.const = {seconds: 1727998800}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  com.google.protobuf.Timestamp getConst();
  /**
   * <pre>
   * `const` dictates that this field, of the `google.protobuf.Timestamp` type, must exactly match the specified value. If the field value doesn't correspond to the specified timestamp, an error message will be generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must equal 2023-05-03T10:00:00Z
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.const = {seconds: 1727998800}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getConstOrBuilder();

  /**
   * <pre>
   * requires the duration field value to be less than the specified value (field &lt; value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   *   // duration must be less than 'P3D' [duration.lt]
   *   google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = { seconds: 259200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * requires the duration field value to be less than the specified value (field &lt; value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   *   // duration must be less than 'P3D' [duration.lt]
   *   google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = { seconds: 259200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return The lt.
   */
  com.google.protobuf.Timestamp getLt();
  /**
   * <pre>
   * requires the duration field value to be less than the specified value (field &lt; value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   *   // duration must be less than 'P3D' [duration.lt]
   *   google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = { seconds: 259200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getLtOrBuilder();

  /**
   * <pre>
   * requires the timestamp field value to be less than or equal to the specified value (field &lt;= value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be less than or equal to '2023-05-14T00:00:00Z' [timestamp.lte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.lte = { seconds: 1678867200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * requires the timestamp field value to be less than or equal to the specified value (field &lt;= value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be less than or equal to '2023-05-14T00:00:00Z' [timestamp.lte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.lte = { seconds: 1678867200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return The lte.
   */
  com.google.protobuf.Timestamp getLte();
  /**
   * <pre>
   * requires the timestamp field value to be less than or equal to the specified value (field &lt;= value). If the field value doesn't meet the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be less than or equal to '2023-05-14T00:00:00Z' [timestamp.lte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.lte = { seconds: 1678867200 }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getLteOrBuilder();

  /**
   * <pre>
   * `lt_now` specifies that this field, of the `google.protobuf.Timestamp` type, must be less than the current time. `lt_now` can only be used with the `within` rule.
   *
   * ```proto
   * message MyTimestamp {
   *  // value must be less than now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.lt_now = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool lt_now = 7 [json_name = "ltNow", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the ltNow field is set.
   */
  boolean hasLtNow();
  /**
   * <pre>
   * `lt_now` specifies that this field, of the `google.protobuf.Timestamp` type, must be less than the current time. `lt_now` can only be used with the `within` rule.
   *
   * ```proto
   * message MyTimestamp {
   *  // value must be less than now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.lt_now = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool lt_now = 7 [json_name = "ltNow", (.buf.validate.priv.field) = { ... }</code>
   * @return The ltNow.
   */
  boolean getLtNow();

  /**
   * <pre>
   * `gt` requires the timestamp field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' [timestamp.gt]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gt = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gt_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gt: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gt_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gt: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * `gt` requires the timestamp field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' [timestamp.gt]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gt = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gt_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gt: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gt_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gt: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return The gt.
   */
  com.google.protobuf.Timestamp getGt();
  /**
   * <pre>
   * `gt` requires the timestamp field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' [timestamp.gt]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gt = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gt_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gt: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gt_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gt: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getGtOrBuilder();

  /**
   * <pre>
   * `gte` requires the timestamp field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value
   * must be outside the specified range. If the field value doesn't meet
   * the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' [timestamp.gte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gte = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gte_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gte: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than or equal to '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gte_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gte: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * `gte` requires the timestamp field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value
   * must be outside the specified range. If the field value doesn't meet
   * the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' [timestamp.gte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gte = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gte_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gte: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than or equal to '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gte_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gte: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return The gte.
   */
  com.google.protobuf.Timestamp getGte();
  /**
   * <pre>
   * `gte` requires the timestamp field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value
   * must be outside the specified range. If the field value doesn't meet
   * the required conditions, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' [timestamp.gte]
   *   google.protobuf.Timestamp value = 1 [(buf.validate.field).timestamp.gte = { seconds: 1672444800 }];
   *
   *   // timestamp must be greater than or equal to '2023-01-01T00:00:00Z' and less than '2023-01-02T00:00:00Z' [timestamp.gte_lt]
   *   google.protobuf.Timestamp another_value = 2 [(buf.validate.field).timestamp = { gte: { seconds: 1672444800 }, lt: { seconds: 1672531200 } }];
   *
   *   // timestamp must be greater than or equal to '2023-01-02T00:00:00Z' or less than '2023-01-01T00:00:00Z' [timestamp.gte_lt_exclusive]
   *   google.protobuf.Timestamp other_value = 3 [(buf.validate.field).timestamp = { gte: { seconds: 1672531200 }, lt: { seconds: 1672444800 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Timestamp gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getGteOrBuilder();

  /**
   * <pre>
   * `gt_now` specifies that this field, of the `google.protobuf.Timestamp` type, must be greater than the current time. `gt_now` can only be used with the `within` rule.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must be greater than now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.gt_now = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool gt_now = 8 [json_name = "gtNow", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gtNow field is set.
   */
  boolean hasGtNow();
  /**
   * <pre>
   * `gt_now` specifies that this field, of the `google.protobuf.Timestamp` type, must be greater than the current time. `gt_now` can only be used with the `within` rule.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must be greater than now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.gt_now = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool gt_now = 8 [json_name = "gtNow", (.buf.validate.priv.field) = { ... }</code>
   * @return The gtNow.
   */
  boolean getGtNow();

  /**
   * <pre>
   * `within` specifies that this field, of the `google.protobuf.Timestamp` type, must be within the specified duration of the current time. If the field value isn't within the duration, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must be within 1 hour of now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.within = {seconds: 3600}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9 [json_name = "within", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the within field is set.
   */
  boolean hasWithin();
  /**
   * <pre>
   * `within` specifies that this field, of the `google.protobuf.Timestamp` type, must be within the specified duration of the current time. If the field value isn't within the duration, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must be within 1 hour of now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.within = {seconds: 3600}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9 [json_name = "within", (.buf.validate.priv.field) = { ... }</code>
   * @return The within.
   */
  com.google.protobuf.Duration getWithin();
  /**
   * <pre>
   * `within` specifies that this field, of the `google.protobuf.Timestamp` type, must be within the specified duration of the current time. If the field value isn't within the duration, an error message is generated.
   *
   * ```proto
   * message MyTimestamp {
   *   // value must be within 1 hour of now
   *   google.protobuf.Timestamp created_at = 1 [(buf.validate.field).timestamp.within = {seconds: 3600}];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9 [json_name = "within", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getWithinOrBuilder();

  build.buf.validate.TimestampRules.LessThanCase getLessThanCase();

  build.buf.validate.TimestampRules.GreaterThanCase getGreaterThanCase();
}
