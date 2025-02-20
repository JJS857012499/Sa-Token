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

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Sa-Token 插件加载器，管理所有插件的加载
 *
 * @author click33
 * @since 1.41.0
 */
public class SaTokenPluginLoader {

	public static List<SaTokenPlugin> pluginList;

	/**
	 * 初始化插件
	 */
	public static void init() {
		List<SaTokenPlugin> list = new ArrayList<>();
		ServiceLoader<SaTokenPlugin> plugins = ServiceLoader.load(SaTokenPlugin.class);
		for (SaTokenPlugin plugin : plugins) {
			plugin.setup();
			list.add(plugin);
		}
		pluginList = list;
	}

}
