/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteColorRequest extends RpcAcsRequest<DeleteColorResponse> {
	   

	private String colorId;
	public DeleteColorRequest() {
		super("digitalstore", "2020-01-07", "DeleteColor", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getColorId() {
		return this.colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
		if(colorId != null){
			putBodyParameter("ColorId", colorId);
		}
	}

	@Override
	public Class<DeleteColorResponse> getResponseClass() {
		return DeleteColorResponse.class;
	}

}
