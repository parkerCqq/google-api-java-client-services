/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.dlp.v2.model;

/**
 * Summary of a single tranformation. Only one of 'transformation', 'field_transformation', or
 * 'record_suppress' will be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2TransformationSummary extends com.google.api.client.json.GenericJson {

  /**
   * Set if the transformation was limited to a specific FieldId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId field;

  /**
   * The field transformation that was applied. If multiple field transformations are requested for
   * a single field, this list will contain all of them; otherwise, only one is supplied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FieldTransformation> fieldTransformations;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2FieldTransformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2FieldTransformation.class);
  }

  /**
   * Set if the transformation was limited to a specific info_type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType infoType;

  /**
   * The specific suppression option these stats apply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2RecordSuppression recordSuppress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2SummaryResult> results;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2SummaryResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2SummaryResult.class);
  }

  /**
   * The specific transformation these stats apply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PrimitiveTransformation transformation;

  /**
   * Total size in bytes that were transformed in some way.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long transformedBytes;

  /**
   * Set if the transformation was limited to a specific FieldId.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getField() {
    return field;
  }

  /**
   * Set if the transformation was limited to a specific FieldId.
   * @param field field or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setField(GooglePrivacyDlpV2FieldId field) {
    this.field = field;
    return this;
  }

  /**
   * The field transformation that was applied. If multiple field transformations are requested for
   * a single field, this list will contain all of them; otherwise, only one is supplied.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FieldTransformation> getFieldTransformations() {
    return fieldTransformations;
  }

  /**
   * The field transformation that was applied. If multiple field transformations are requested for
   * a single field, this list will contain all of them; otherwise, only one is supplied.
   * @param fieldTransformations fieldTransformations or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setFieldTransformations(java.util.List<GooglePrivacyDlpV2FieldTransformation> fieldTransformations) {
    this.fieldTransformations = fieldTransformations;
    return this;
  }

  /**
   * Set if the transformation was limited to a specific info_type.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getInfoType() {
    return infoType;
  }

  /**
   * Set if the transformation was limited to a specific info_type.
   * @param infoType infoType or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setInfoType(GooglePrivacyDlpV2InfoType infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * The specific suppression option these stats apply to.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordSuppression getRecordSuppress() {
    return recordSuppress;
  }

  /**
   * The specific suppression option these stats apply to.
   * @param recordSuppress recordSuppress or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setRecordSuppress(GooglePrivacyDlpV2RecordSuppression recordSuppress) {
    this.recordSuppress = recordSuppress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2SummaryResult> getResults() {
    return results;
  }

  /**
   * @param results results or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setResults(java.util.List<GooglePrivacyDlpV2SummaryResult> results) {
    this.results = results;
    return this;
  }

  /**
   * The specific transformation these stats apply to.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation getTransformation() {
    return transformation;
  }

  /**
   * The specific transformation these stats apply to.
   * @param transformation transformation or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setTransformation(GooglePrivacyDlpV2PrimitiveTransformation transformation) {
    this.transformation = transformation;
    return this;
  }

  /**
   * Total size in bytes that were transformed in some way.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTransformedBytes() {
    return transformedBytes;
  }

  /**
   * Total size in bytes that were transformed in some way.
   * @param transformedBytes transformedBytes or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationSummary setTransformedBytes(java.lang.Long transformedBytes) {
    this.transformedBytes = transformedBytes;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2TransformationSummary set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2TransformationSummary) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2TransformationSummary clone() {
    return (GooglePrivacyDlpV2TransformationSummary) super.clone();
  }

}
