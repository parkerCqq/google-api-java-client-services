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

package com.google.api.services.factchecktools.v1alpha1.model;

/**
 * Information about the publisher.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fact Check Tools API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFactcheckingFactchecktoolsV1alpha1Publisher extends com.google.api.client.json.GenericJson {

  /**
   * The name of this publisher. For instance, "Awesome Fact Checks".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Host-level site name, without the protocol or "www" prefix. For instance,
   * "awesomefactchecks.com". This value of this field is based purely on the claim review URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String site;

  /**
   * The name of this publisher. For instance, "Awesome Fact Checks".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this publisher. For instance, "Awesome Fact Checks".
   * @param name name or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1Publisher setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Host-level site name, without the protocol or "www" prefix. For instance,
   * "awesomefactchecks.com". This value of this field is based purely on the claim review URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSite() {
    return site;
  }

  /**
   * Host-level site name, without the protocol or "www" prefix. For instance,
   * "awesomefactchecks.com". This value of this field is based purely on the claim review URL.
   * @param site site or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1Publisher setSite(java.lang.String site) {
    this.site = site;
    return this;
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1Publisher set(String fieldName, Object value) {
    return (GoogleFactcheckingFactchecktoolsV1alpha1Publisher) super.set(fieldName, value);
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1Publisher clone() {
    return (GoogleFactcheckingFactchecktoolsV1alpha1Publisher) super.clone();
  }

}
