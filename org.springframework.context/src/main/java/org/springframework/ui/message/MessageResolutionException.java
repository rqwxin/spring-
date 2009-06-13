/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.ui.message;

/**
 * Runtime exception thrown by a {@link MessageResolver} if a message resolution fails.
 * @author Keith Donald
 */
@SuppressWarnings("serial")
public class MessageResolutionException extends RuntimeException {

	/**
	 * Creates a new message resolution exception.
	 * @param message a messaging describing the failure
	 * @param cause the cause of the failure
	 */
	public MessageResolutionException(String message, Throwable cause) {
		super(message, cause);
	}

}
