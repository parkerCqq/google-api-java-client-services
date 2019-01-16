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

package com.google.api.services.youtube.model;

/**
 * A resource id is a generic reference that points to another YouTube resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceId extends com.google.api.client.json.GenericJson {

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * channel. This property is only present if the resourceId.kind value is youtube#channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The type of the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * playlist. This property is only present if the resourceId.kind value is youtube#playlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String playlistId;

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * video. This property is only present if the resourceId.kind value is youtube#video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * channel. This property is only present if the resourceId.kind value is youtube#channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * channel. This property is only present if the resourceId.kind value is youtube#channel.
   * @param channelId channelId or {@code null} for none
   */
  public ResourceId setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The type of the API resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource.
   * @param kind kind or {@code null} for none
   */
  public ResourceId setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * playlist. This property is only present if the resourceId.kind value is youtube#playlist.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaylistId() {
    return playlistId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * playlist. This property is only present if the resourceId.kind value is youtube#playlist.
   * @param playlistId playlistId or {@code null} for none
   */
  public ResourceId setPlaylistId(java.lang.String playlistId) {
    this.playlistId = playlistId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * video. This property is only present if the resourceId.kind value is youtube#video.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a
   * video. This property is only present if the resourceId.kind value is youtube#video.
   * @param videoId videoId or {@code null} for none
   */
  public ResourceId setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  @Override
  public ResourceId set(String fieldName, Object value) {
    return (ResourceId) super.set(fieldName, value);
  }

  @Override
  public ResourceId clone() {
    return (ResourceId) super.clone();
  }

}