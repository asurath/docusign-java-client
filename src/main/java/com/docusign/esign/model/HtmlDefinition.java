package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * HTML Definition
 */
public class HtmlDefinition {

  @JsonProperty("source")
  private String source = null;

  /**
   *
   * @return source
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

}
