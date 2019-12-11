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
 * The desired state of the Trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerSpec extends com.google.api.client.json.GenericJson {

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'.
   *
   * Not currently supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String broker;

  /**
   * Filter is the filter to apply against all events from the Broker. Only events that pass this
   * filter will be sent to the Subscriber.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TriggerFilter filter;

  /**
   * Deprecated, importer specification will be replaced by information stored in GcpImporterDao.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TriggerImporterSpec> importers;

  static {
    // hack to force ProGuard to consider TriggerImporterSpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TriggerImporterSpec.class);
  }

  /**
   * Subscriber is the addressable that receives events from the Broker that pass the Filter. It is
   * required.
   *
   * E.g. https://us-central1-myproject.cloudfunctions.net/myfunction or /namespaces/my-
   * project/services/my-service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubscriberSpec subscriber;

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'.
   *
   * Not currently supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getBroker() {
    return broker;
  }

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'.
   *
   * Not currently supported by Cloud Run.
   * @param broker broker or {@code null} for none
   */
  public TriggerSpec setBroker(java.lang.String broker) {
    this.broker = broker;
    return this;
  }

  /**
   * Filter is the filter to apply against all events from the Broker. Only events that pass this
   * filter will be sent to the Subscriber.
   * @return value or {@code null} for none
   */
  public TriggerFilter getFilter() {
    return filter;
  }

  /**
   * Filter is the filter to apply against all events from the Broker. Only events that pass this
   * filter will be sent to the Subscriber.
   * @param filter filter or {@code null} for none
   */
  public TriggerSpec setFilter(TriggerFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Deprecated, importer specification will be replaced by information stored in GcpImporterDao.
   * @return value or {@code null} for none
   */
  public java.util.List<TriggerImporterSpec> getImporters() {
    return importers;
  }

  /**
   * Deprecated, importer specification will be replaced by information stored in GcpImporterDao.
   * @param importers importers or {@code null} for none
   */
  public TriggerSpec setImporters(java.util.List<TriggerImporterSpec> importers) {
    this.importers = importers;
    return this;
  }

  /**
   * Subscriber is the addressable that receives events from the Broker that pass the Filter. It is
   * required.
   *
   * E.g. https://us-central1-myproject.cloudfunctions.net/myfunction or /namespaces/my-
   * project/services/my-service.
   * @return value or {@code null} for none
   */
  public SubscriberSpec getSubscriber() {
    return subscriber;
  }

  /**
   * Subscriber is the addressable that receives events from the Broker that pass the Filter. It is
   * required.
   *
   * E.g. https://us-central1-myproject.cloudfunctions.net/myfunction or /namespaces/my-
   * project/services/my-service.
   * @param subscriber subscriber or {@code null} for none
   */
  public TriggerSpec setSubscriber(SubscriberSpec subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  @Override
  public TriggerSpec set(String fieldName, Object value) {
    return (TriggerSpec) super.set(fieldName, value);
  }

  @Override
  public TriggerSpec clone() {
    return (TriggerSpec) super.clone();
  }

}
