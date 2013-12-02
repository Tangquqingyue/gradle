/*
 * Copyright 2013 the original author or authors.
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
package org.gradle.api.internal.tasks.testing.selection;

import org.gradle.api.Action;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.testing.TestFilter;
import org.gradle.api.tasks.testing.TestSelectionSpec;

public class DefaultTestFilter implements TestFilter {

    private DefaultTestSelectionSpec include = new DefaultTestSelectionSpec();

    @Nested
    public DefaultTestSelectionSpec getInclude() {
        return include;
    }

    public DefaultTestFilter include(Action<TestSelectionSpec> configure) {
        configure.execute(include);
        return this;
    }
}