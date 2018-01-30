package com.instagram.common.json.annotation.processor.parent;

import com.instagram.common.json.annotation.JsonType;

@JsonType(
        serializeCodeFormatter = "com.instagram.common.json.annotation.processor.parent.InterfaceParentDynamicUUTHelper.DISPATCHER.serializeToJson("
            + "${generator_object}, ${object_varname}.${field_varname})",
        valueExtractFormatter = "com.instagram.common.json.annotation.processor.parent.InterfaceParentDynamicUUTHelper.DISPATCHER.parseFromJson("
            + "${parser_object})")
public interface InterfaceParentDynamicUUT extends DynamicDispatchAdapter.TypeNameProvider {
}
