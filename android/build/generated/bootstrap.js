/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 * Warning: This file is GENERATED, and should not be modified
 */
var bootstrap = kroll.NativeModule.require("bootstrap"),
	invoker = kroll.NativeModule.require("invoker"),
	Titanium = kroll.binding("Titanium").Titanium;

function moduleBootstrap(moduleBinding) {
	function lazyGet(object, binding, name, namespace) {
		return bootstrap.lazyGet(object, binding,
			name, namespace, moduleBinding.getBinding);
	}

	var module = moduleBinding.getBinding("ti.appinfo.AppinfoModule")["Appinfo"];
	var invocationAPIs = module.invocationAPIs = [];
	module.apiName = "Appinfo";

	function addInvocationAPI(module, moduleNamespace, namespace, api) {
		invocationAPIs.push({ namespace: namespace, api: api });
	}

	
			if (!("__propertiesDefined__" in module)) {		
		Object.defineProperties(module, {
			"ApplicationInfo": {
				get: function() {
					var ApplicationInfo = lazyGet(this, "ti.appinfo.ApplicationInfoModule", "ApplicationInfo", "ApplicationInfo");
					return ApplicationInfo;
				},
				configurable: true
			},
			"Filesystem": {
				get: function() {
					var Filesystem = lazyGet(this, "ti.appinfo.FilesystemModule", "Filesystem", "Filesystem");
					return Filesystem;
				},
				configurable: true
			},
		
		});
		}
		module.__propertiesDefined__ = true;
		return module;

}
exports.bootstrap = moduleBootstrap;
