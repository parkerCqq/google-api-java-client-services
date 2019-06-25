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
 * iOS related attributes to the Dynamic Link..
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
public final class IosInfo extends com.google.api.client.json.GenericJson {

  /**
   * iOS App Store ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosAppStoreId;

  /**
   * iOS bundle ID of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosBundleId;

  /**
   * Custom (destination) scheme to use for iOS. By default, we’ll use the bundle ID as the custom
   * scheme. Developer can override this behavior using this param.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosCustomScheme;

  /**
   * Link to open on iOS if the app is not installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosFallbackLink;

  /**
   * iPad bundle ID of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosIpadBundleId;

  /**
   * If specified, this overrides the ios_fallback_link value on iPads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosIpadFallbackLink;

  /**
   * iOS minimum version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosMinimumVersion;

  /**
   * iOS App Store ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosAppStoreId() {
    return iosAppStoreId;
  }

  /**
   * iOS App Store ID.
   * @param iosAppStoreId iosAppStoreId or {@code null} for none
   */
  public IosInfo setIosAppStoreId(java.lang.String iosAppStoreId) {
    this.iosAppStoreId = iosAppStoreId;
    return this;
  }

  /**
   * iOS bundle ID of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosBundleId() {
    return iosBundleId;
  }

  /**
   * iOS bundle ID of the app.
   * @param iosBundleId iosBundleId or {@code null} for none
   */
  public IosInfo setIosBundleId(java.lang.String iosBundleId) {
    this.iosBundleId = iosBundleId;
    return this;
  }

  /**
   * Custom (destination) scheme to use for iOS. By default, we’ll use the bundle ID as the custom
   * scheme. Developer can override this behavior using this param.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosCustomScheme() {
    return iosCustomScheme;
  }

  /**
   * Custom (destination) scheme to use for iOS. By default, we’ll use the bundle ID as the custom
   * scheme. Developer can override this behavior using this param.
   * @param iosCustomScheme iosCustomScheme or {@code null} for none
   */
  public IosInfo setIosCustomScheme(java.lang.String iosCustomScheme) {
    this.iosCustomScheme = iosCustomScheme;
    return this;
  }

  /**
   * Link to open on iOS if the app is not installed.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosFallbackLink() {
    return iosFallbackLink;
  }

  /**
   * Link to open on iOS if the app is not installed.
   * @param iosFallbackLink iosFallbackLink or {@code null} for none
   */
  public IosInfo setIosFallbackLink(java.lang.String iosFallbackLink) {
    this.iosFallbackLink = iosFallbackLink;
    return this;
  }

  /**
   * iPad bundle ID of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosIpadBundleId() {
    return iosIpadBundleId;
  }

  /**
   * iPad bundle ID of the app.
   * @param iosIpadBundleId iosIpadBundleId or {@code null} for none
   */
  public IosInfo setIosIpadBundleId(java.lang.String iosIpadBundleId) {
    this.iosIpadBundleId = iosIpadBundleId;
    return this;
  }

  /**
   * If specified, this overrides the ios_fallback_link value on iPads.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosIpadFallbackLink() {
    return iosIpadFallbackLink;
  }

  /**
   * If specified, this overrides the ios_fallback_link value on iPads.
   * @param iosIpadFallbackLink iosIpadFallbackLink or {@code null} for none
   */
  public IosInfo setIosIpadFallbackLink(java.lang.String iosIpadFallbackLink) {
    this.iosIpadFallbackLink = iosIpadFallbackLink;
    return this;
  }

  /**
   * iOS minimum version.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosMinimumVersion() {
    return iosMinimumVersion;
  }

  /**
   * iOS minimum version.
   * @param iosMinimumVersion iosMinimumVersion or {@code null} for none
   */
  public IosInfo setIosMinimumVersion(java.lang.String iosMinimumVersion) {
    this.iosMinimumVersion = iosMinimumVersion;
    return this;
  }

  @Override
  public IosInfo set(String fieldName, Object value) {
    return (IosInfo) super.set(fieldName, value);
  }

  @Override
  public IosInfo clone() {
    return (IosInfo) super.clone();
  }

}
