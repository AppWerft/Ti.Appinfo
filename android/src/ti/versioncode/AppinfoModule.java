/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.versioncode;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

@Kroll.module(name = "Versioncode", id = "ti.versioncode")
public class AppinfoModule extends KrollModule {
	public AppinfoModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

	@Kroll.method
	public static KrollDict get() {
		KrollDict kd = new KrollDict();
		int versionCode = 0;
		long firstInstallTime = 0;
		String versionName = null;
		Context ctx = TiApplication.getInstance().getApplicationContext();
		try {
			versionCode = ctx.getPackageManager().getPackageInfo(
					TiApplication.getInstance().getApplicationContext()
							.getPackageName(), 0).versionCode;
			firstInstallTime = ctx.getPackageManager().getPackageInfo(
					TiApplication.getInstance().getApplicationContext()
							.getPackageName(), 0).firstInstallTime;
			versionName = ctx.getPackageManager().getPackageInfo(
					TiApplication.getInstance().getApplicationContext()
							.getPackageName(), 0).versionName;

		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		kd.put("versionsCode", versionCode);
		kd.put("firstInstallTime", firstInstallTime);
		kd.put("versionName", versionName);

		return kd;
	}
}
