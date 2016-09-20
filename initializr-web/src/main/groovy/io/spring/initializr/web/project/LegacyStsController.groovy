/*
 * Copyright 2012-2016 the original author or authors.
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

package io.spring.initializr.web.project

import io.spring.initializr.metadata.InitializrMetadataProvider
import io.spring.initializr.util.GroovyTemplate

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * A controller used to serve the legacy home page used by STS.
 *
 * @author Stephane Nicoll
 * @since 1.0
 */
@Controller
@Deprecated
class LegacyStsController extends AbstractInitializrController {

	LegacyStsController(InitializrMetadataProvider metadataProvider, GroovyTemplate groovyTemplate) {
		super(metadataProvider, groovyTemplate)
	}

	@RequestMapping(value = '/sts', produces = 'text/html')
	@ResponseBody
	String stsHome() {
		renderHome('sts-home.html')
	}

}
