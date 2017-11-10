package org.asocframework.spi.model.base;

/**
 * @author jiqing
 * @version $Id: ParameterValidator，v 1.0 2017/10/27 10:33 jiqing Exp $
 * @desc
 */
public class ParameterValidator {

    /**
     * 是否必需
     */
    private Boolean required;
    /**
     * 是小长度
     */
    private Integer minLength;
    /**
     * 最大长度
     */
    private Integer maxLength;
    /**
     * 正则较验
     */
    private String  regexp;
    /**
     * 最小值
     */
    private String  minValue;
    /**
     * 最大值
     */
    private String	maxValue;
    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 枚举值
     */
    private String enumValues;

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues;
    }
}
