/*
 * Copyright 2008-2009 the original author or authors.
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
package net.hasor.dataway.spi;
import java.util.EventListener;
import java.util.Map;

/**
 * 参数解析 SPI，可以通过这个 SPI 对 Api 的入参进行控制和改写。（is chainSpi）
 * @author 赵永春 (zyc@hasor.net)
 * @version : 2020-04-22
 */
public interface ParseParameterChainSpi extends EventListener {
    /**
     * 执行SPI，改写请求参数。将改写之后的参数 作为返回值返回即可。
     * @param perform 是否为 UI 页面中发起的
     * @param apiInfo api信息
     * @param parameter 待处理的参数信息
     */
    public Map<String, Object> parseParameter(boolean perform, ApiInfo apiInfo, Map<String, Object> parameter);
}