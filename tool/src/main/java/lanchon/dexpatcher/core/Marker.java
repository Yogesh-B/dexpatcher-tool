/*
 * DexPatcher - Copyright 2015-2020 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher.core;

import lanchon.dexpatcher.core.util.TypeName;

public class Marker {

	// Annotation Elements

	public static final String ELEM_TARGET = "target";
	public static final String ELEM_TARGET_CLASS = "targetClass";
	public static final String ELEM_STATIC_CONSTRUCTOR_ACTION = "staticConstructorAction";
	public static final String ELEM_DEFAULT_ACTION = "defaultAction";
	public static final String ELEM_CONTENT_ONLY = "contentOnly";
	public static final String ELEM_RECURSIVE = "recursive";

	public static final String ELEM_ONLY_EDIT_MEMBERS = "onlyEditMembers";                  // deprecated

	// Actions

	private static final String DEXPATCHER_PREFIX = "__$";

	public static final String WRAP_SOURCE_SUFFIX = DEXPATCHER_PREFIX + "wrapSource";
	public static final String PREPEND_SOURCE_SUFFIX = DEXPATCHER_PREFIX + "prependSource";
	public static final String PREPEND_PATCH_SUFFIX = DEXPATCHER_PREFIX + "prependPatch";
	public static final String APPEND_SOURCE_SUFFIX = DEXPATCHER_PREFIX + "appendSource";
	public static final String APPEND_PATCH_SUFFIX = DEXPATCHER_PREFIX + "appendPatch";

	public static final String SPECIAL_METHOD_PREFIX = DEXPATCHER_PREFIX;

	// Dalvik

	public static final String TYPE_VOID = "V";
	public static final String TYPE_INNER_CLASS = TypeName.toClassDescriptor("dalvik.annotation.InnerClass");
	public static final String ELEM_ACCESS_FLAGS = "accessFlags";
	public static final String NAME_VOID = "void";
	public static final String NAME_STATIC_CONSTRUCTOR = "<clinit>";
	public static final String NAME_INSTANCE_CONSTRUCTOR = "<init>";
	public static final String NAME_PACKAGE_INFO = "package-info";

	private Marker() {}

}
