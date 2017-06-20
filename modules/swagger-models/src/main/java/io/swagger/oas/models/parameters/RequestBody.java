/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.models.parameters;

import io.swagger.oas.models.media.Content;

/**
 * RequestBody
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc2/versions/3.0.md#requestBodyObject"
 */


public class RequestBody {
  private String description = null;
  private Content content = null;
  private Boolean required = null;
  private java.util.Map<String, Object> extensions = null;
  private String $ref = null;

  /**
   * returns the description property from a RequestBody instance.
   *
   * @return String description
   **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RequestBody description(String description) {
    this.description = description;
    return this;
  }

  /**
   * returns the content property from a RequestBody instance.
   *
   * @return Content content
   **/

  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  public RequestBody content(Content content) {
    this.content = content;
    return this;
  }

  /**
   * returns the required property from a RequestBody instance.
   *
   * @return Boolean required
   **/

  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public RequestBody required(Boolean required) {
    this.required = required;
    return this;
  }

  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  public String get$ref() {
    return $ref;
  }

  public void set$ref(String $ref) {
    this.$ref = $ref;
  }

  public RequestBody $ref(String $ref) {
    this.$ref = $ref;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RequestBody)) {
      return false;
    }

    RequestBody that = (RequestBody) o;

    if (description != null ? !description.equals(that.description) : that.description != null) {
      return false;
    }
    if (content != null ? !content.equals(that.content) : that.content != null) {
      return false;
    }
    if (required != null ? !required.equals(that.required) : that.required != null) {
      return false;
    }
    if (extensions != null ? !extensions.equals(that.extensions) : that.extensions != null) {
      return false;
    }
    return $ref != null ? $ref.equals(that.$ref) : that.$ref == null;

  }

  @Override
  public int hashCode() {
    int result = description != null ? description.hashCode() : 0;
    result = 31 * result + (content != null ? content.hashCode() : 0);
    result = 31 * result + (required != null ? required.hashCode() : 0);
    result = 31 * result + (extensions != null ? extensions.hashCode() : 0);
    result = 31 * result + ($ref != null ? $ref.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
