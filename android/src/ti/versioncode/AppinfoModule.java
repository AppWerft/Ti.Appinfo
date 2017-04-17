/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.versioncode;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

@Kroll.module(name = "Versioncode", id = "ti.versioncode")
public class AppinfoModule extends KrollModule {
	private static KrollDict appinfo = new KrollDict();
	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss,SSS", Locale.US);

	public AppinfoModule() {
		super();

	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {

		Context ctx = TiApplication.getInstance().getApplicationContext();
		try {
			PackageInfo pInfo = ctx.getPackageManager().getPackageInfo(
					TiApplication.getInstance().getApplicationContext()
							.getPackageName(), 0);
			ApplicationInfo appInfo = pInfo.applicationInfo;
			KrollDict ai = new KrollDict();
			ai.put("backupAgentName", appInfo.backupAgentName);
			ai.put("dataDir", appInfo.dataDir);
			ai.put("name", appInfo.name);
			ai.put("nativeLibraryDir", appInfo.nativeLibraryDir);
			ai.put("sharedLibraryFiles", appInfo.sharedLibraryFiles);
			appinfo.put("appInfo", ai);
			appinfo.put("sharedUserId", pInfo.sharedUserId);
			appinfo.put("versionsCode", pInfo.versionCode);
			appinfo.put("firstInstallTime", pInfo.firstInstallTime);
			appinfo.put("firstInstallDate", time2date(pInfo.firstInstallTime));

			appinfo.put("lastUpdateTime", pInfo.lastUpdateTime);
			appinfo.put("versionName", pInfo.versionName);
			appinfo.put("requestedPermissions", pInfo.requestedPermissions);
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Kroll.method
	public static KrollDict getAll() {
		return appinfo;
	}

	@Kroll.method
	public static String getBackupAgentName() {
		return appinfo.getKrollDict("appinfo").getString("backupAgentName");
	}

	@Kroll.method
	public static String getDataDir() {
		return appinfo.getKrollDict("appinfo").getString("dataDir");
	}

	@Kroll.method
	public static String getNativeLibraryDir() {
		return appinfo.getKrollDict("appinfo").getString("nativeLibraryDir");
	}

	@Kroll.method
	public static String getSharedLibraryFiles() {
		return appinfo.getKrollDict("appinfo").getString("sharedLibraryFiles");
	}

	@Kroll.method
	public static String getName() {
		return appinfo.getKrollDict("appinfo").getString("name");
	}

	@Kroll.method
	public static int getVersionsCode() {
		return appinfo.getInt("versionsCode");
	}

	private static String time2date(long time) {
		GregorianCalendar calendar = new GregorianCalendar(
				TimeZone.getTimeZone("US/Central"));
		calendar.setTimeInMillis(time);
		return sdf.format(calendar.getTime());
	}
}
