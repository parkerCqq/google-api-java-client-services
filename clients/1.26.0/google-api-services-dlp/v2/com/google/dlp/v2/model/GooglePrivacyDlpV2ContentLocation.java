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
 * Findings container location data.
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
public final class GooglePrivacyDlpV2ContentLocation extends com.google.api.client.json.GenericJson {

  /**
   * Name of the container where the finding is located. The top level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows:
   *
   * * BigQuery tables:  `:.` * Cloud Storage files: `gs:` * Datastore namespace:
   *
   * Nested names could be absent if the embedded object has no string identifier (for an example an
   * image contained within a document).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerName;

  /**
   * Findings container modification timestamp, if applicable. For Google Cloud Storage contains
   * last file modification timestamp. For BigQuery table contains last_modified_time property. For
   * Datastore - not populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String containerTimestamp;

  /**
   * Findings container version, if available ("generation" for Google Cloud Storage).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerVersion;

  /**
   * Location data for document files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DocumentLocation documentLocation;

  /**
   * Location within an image's pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ImageLocation imageLocation;

  /**
   * Location within a row or record of a database table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2RecordLocation recordLocation;

  /**
   * Name of the container where the finding is located. The top level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows:
   *
   * * BigQuery tables:  `:.` * Cloud Storage files: `gs:` * Datastore namespace:
   *
   * Nested names could be absent if the embedded object has no string identifier (for an example an
   * image contained within a document).
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerName() {
    return containerName;
  }

  /**
   * Name of the container where the finding is located. The top level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows:
   *
   * * BigQuery tables:  `:.` * Cloud Storage files: `gs:` * Datastore namespace:
   *
   * Nested names could be absent if the embedded object has no string identifier (for an example an
   * image contained within a document).
   * @param containerName containerName or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setContainerName(java.lang.String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Findings container modification timestamp, if applicable. For Google Cloud Storage contains
   * last file modification timestamp. For BigQuery table contains last_modified_time property. For
   * Datastore - not populated.
   * @return value or {@code null} for none
   */
  public String getContainerTimestamp() {
    return containerTimestamp;
  }

  /**
   * Findings container modification timestamp, if applicable. For Google Cloud Storage contains
   * last file modification timestamp. For BigQuery table contains last_modified_time property. For
   * Datastore - not populated.
   * @param containerTimestamp containerTimestamp or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setContainerTimestamp(String containerTimestamp) {
    this.containerTimestamp = containerTimestamp;
    return this;
  }

  /**
   * Findings container version, if available ("generation" for Google Cloud Storage).
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerVersion() {
    return containerVersion;
  }

  /**
   * Findings container version, if available ("generation" for Google Cloud Storage).
   * @param containerVersion containerVersion or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setContainerVersion(java.lang.String containerVersion) {
    this.containerVersion = containerVersion;
    return this;
  }

  /**
   * Location data for document files.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DocumentLocation getDocumentLocation() {
    return documentLocation;
  }

  /**
   * Location data for document files.
   * @param documentLocation documentLocation or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setDocumentLocation(GooglePrivacyDlpV2DocumentLocation documentLocation) {
    this.documentLocation = documentLocation;
    return this;
  }

  /**
   * Location within an image's pixels.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ImageLocation getImageLocation() {
    return imageLocation;
  }

  /**
   * Location within an image's pixels.
   * @param imageLocation imageLocation or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setImageLocation(GooglePrivacyDlpV2ImageLocation imageLocation) {
    this.imageLocation = imageLocation;
    return this;
  }

  /**
   * Location within a row or record of a database table.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordLocation getRecordLocation() {
    return recordLocation;
  }

  /**
   * Location within a row or record of a database table.
   * @param recordLocation recordLocation or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentLocation setRecordLocation(GooglePrivacyDlpV2RecordLocation recordLocation) {
    this.recordLocation = recordLocation;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ContentLocation set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ContentLocation) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ContentLocation clone() {
    return (GooglePrivacyDlpV2ContentLocation) super.clone();
  }

}
