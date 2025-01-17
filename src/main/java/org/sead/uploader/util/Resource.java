/*******************************************************************************
 * Copyright 2016 University of Michigan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.sead.uploader.util;

import org.apache.http.entity.mime.content.ContentBody;
import org.json.JSONObject;

public interface Resource extends Iterable<Resource> {

	String getName();

	boolean isDirectory();

	String getPath();

	long length();

	String getAbsolutePath();

	ContentBody getContentBody();

	Iterable<Resource> listResources();

	String getHash(String algorithm);
	
	JSONObject getMetadata();

}
