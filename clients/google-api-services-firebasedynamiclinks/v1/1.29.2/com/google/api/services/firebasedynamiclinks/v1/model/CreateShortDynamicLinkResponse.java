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

package com.google.api.services.firebasedynamiclinks.v1.model;

/**
 * Response to create a short Dynamic Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateShortDynamicLinkResponse extends com.google.api.client.json.GenericJson {

  /**
   * Preview link to show the link flow chart. (debug info.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String previewLink;

  /**
   * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortLink;

  /**
   * Information about potential warnings on link creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DynamicLinkWarning> warning;

  /**
   * Preview link to show the link flow chart. (debug info.)
   * @return value or {@code null} for none
   */
  public java.lang.String getPreviewLink() {
    return previewLink;
  }

  /**
   * Preview link to show the link flow chart. (debug info.)
   * @param previewLink previewLink or {@code null} for none
   */
  public CreateShortDynamicLinkResponse setPreviewLink(java.lang.String previewLink) {
    this.previewLink = previewLink;
    return this;
  }

  /**
   * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
   * @return value or {@code null} for none
   */
  public java.lang.String getShortLink() {
    return shortLink;
  }

  /**
   * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
   * @param shortLink shortLink or {@code null} for none
   */
  public CreateShortDynamicLinkResponse setShortLink(java.lang.String shortLink) {
    this.shortLink = shortLink;
    return this;
  }

  /**
   * Information about potential warnings on link creation.
   * @return value or {@code null} for none
   */
  public java.util.List<DynamicLinkWarning> getWarning() {
    return warning;
  }

  /**
   * Information about potential warnings on link creation.
   * @param warning warning or {@code null} for none
   */
  public CreateShortDynamicLinkResponse setWarning(java.util.List<DynamicLinkWarning> warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public CreateShortDynamicLinkResponse set(String fieldName, Object value) {
    return (CreateShortDynamicLinkResponse) super.set(fieldName, value);
  }

  @Override
  public CreateShortDynamicLinkResponse clone() {
    return (CreateShortDynamicLinkResponse) super.clone();
  }

}
