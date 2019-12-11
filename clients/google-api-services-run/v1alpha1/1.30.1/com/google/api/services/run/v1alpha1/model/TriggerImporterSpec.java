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

package com.google.api.services.run.v1alpha1.model;

/**
 * Deprecated, importer specification will be available via GcpImporterDao.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerImporterSpec extends com.google.api.client.json.GenericJson {

  /**
   * Arguments to use for the importer. These must match the parameters in the EventType's importer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> arguments;

  /**
   * Name of the EventType that this importer provides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventTypeName;

  /**
   * Arguments to use for the importer. These must match the parameters in the EventType's importer.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getArguments() {
    return arguments;
  }

  /**
   * Arguments to use for the importer. These must match the parameters in the EventType's importer.
   * @param arguments arguments or {@code null} for none
   */
  public TriggerImporterSpec setArguments(java.util.Map<String, java.lang.String> arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * Name of the EventType that this importer provides.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventTypeName() {
    return eventTypeName;
  }

  /**
   * Name of the EventType that this importer provides.
   * @param eventTypeName eventTypeName or {@code null} for none
   */
  public TriggerImporterSpec setEventTypeName(java.lang.String eventTypeName) {
    this.eventTypeName = eventTypeName;
    return this;
  }

  @Override
  public TriggerImporterSpec set(String fieldName, Object value) {
    return (TriggerImporterSpec) super.set(fieldName, value);
  }

  @Override
  public TriggerImporterSpec clone() {
    return (TriggerImporterSpec) super.clone();
  }

}
