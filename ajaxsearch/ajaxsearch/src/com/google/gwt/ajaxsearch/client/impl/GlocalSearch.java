/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxsearch.client.impl;

import com.google.gwt.ajaxsearch.client.Search;
import com.google.gwt.ajaxsearch.jsio.client.Constructor;
import com.google.gwt.ajaxsearch.jsio.client.JSOpaque;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

/**
 */
public interface GlocalSearch extends GSearch {
  JSOpaque RESULT_CLASS = new JSOpaque("$wnd.GlocalSearch.RESULT_CLASS");
  GlocalSearch IMPL = GWT.create(GlocalSearch.class);

  @Constructor("$wnd.GlocalSearch")
  JavaScriptObject construct();

  // XXX Possible integration with Maps API. Consider code bloat before adding
  // public void setCenterPoint(GMap point);
  // public void setCenterPoint(GPoint point);

  void setAddressLookupMode(Search jso, JSOpaque mode);

  void setCenterPoint(Search jso, String point);
}