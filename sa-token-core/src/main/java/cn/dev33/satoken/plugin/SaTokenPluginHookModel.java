/*
 * Copyright 2020-2099 sa-token.cc
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
package cn.dev33.satoken.plugin;

import cn.dev33.satoken.fun.hooks.SaTokenPluginHookFunction;

/**
 * Sa-Token 插件 Hook Model
 *
 * @author click33
 * @since 1.41.0
 */
public class SaTokenPluginHookModel<T extends SaTokenPlugin> {

	/**
	 * 监听插件类型
	 */
	public Class<T> listenerClass;

	/**
	 * 执行的方法
	 */
	public SaTokenPluginHookFunction<T> executeFunction;

	/**
	 * 构造函数
	 * @param listenerClass /
	 * @param executeFunction /
	 */
	public SaTokenPluginHookModel(Class<T> listenerClass, SaTokenPluginHookFunction<T> executeFunction) {
		this.listenerClass = listenerClass;
		this.executeFunction = executeFunction;
	}

}
