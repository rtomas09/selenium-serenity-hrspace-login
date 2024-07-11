package utils;

import org.openqa.selenium.By;

public enum Selectors {
    USERNAME_INPUT(StringValues.USERNAME_INPUT),
    PASSWORD_INPUT(StringValues.PASSWORD_INPUT),
    LOGIN_BUTTON(StringValues.LOGIN_BUTTON),
    USER_HEADER_PHOTO_NAME(StringValues.USER_HEADER_PHOTO_NAME),
    HEADER_MODULE_PICKER_BUTTON(StringValues.HEADER_MODULE_PICKER_BUTTON),
    HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV(StringValues.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV),
    HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR(StringValues.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR),
    LOADING_ICON(StringValues.LOADING_ICON),
    ORGANISATION_INFO_MAIN_CONTENT_BASE_DIV(StringValues.ORGANISATION_INFO_MAIN_CONTENT_BASE_DIV),
    ORGANISATION_INFO_HEADER_TAB_ANCHOR(StringValues.ORGANISATION_INFO_HEADER_TAB_ANCHOR),
    HIERARCHY_CHART_BASE_DIV(StringValues.HIERARCHY_CHART_BASE_DIV),
    ORGANISATION_INFO_LOADING_SHIM(StringValues.ORGANISATION_INFO_LOADING_SHIM),
    ORG_CHART_POSITION_TITLE_ANCHOR(StringValues.ORG_CHART_POSITION_TITLE_ANCHOR),
    PORTLET_BODY_BASE_DIV(StringValues.PORTLET_BODY_BASE_DIV),
    PORTLET_SHOW_MENU_ANCHOR(StringValues.PORTLET_SHOW_MENU_ANCHOR),
    PORTLET_MENU_ANCHOR(StringValues.PORTLET_MENU_ANCHOR),
    HOC_NODE_BODY_BASE_DIV(StringValues.HOC_NODE_BODY_BASE_DIV),
    HOC_NODE_ICON_SECTION_DIV(StringValues.HOC_NODE_ICON_SECTION_DIV),
    JOB_REQUISITION_APPROVED_ICON(StringValues.JOB_REQUISITION_APPROVED_ICON),
    SHOW_POSITION_ICON(StringValues.SHOW_POSITION_ICON),
    OVERLAY_PORTLET_TD_FIELD_VALUE(StringValues.OVERLAY_PORTLET_TD_FIELD_VALUE),
    CLOSE_ICON(StringValues.CLOSE_ICON),
    OVERLAY_LOADING_ANIMATION(StringValues.OVERLAY_LOADING_ANIMATION),
    PORTLET_HEADER_BASE_DIV(StringValues.PORTLET_HEADER_BASE_DIV),
    PORTLET_HEADER_TITLE(StringValues.PORTLET_HEADER_TITLE),
    LABELED_BUTTON(StringValues.LABELED_BUTTON),
    COMBO_DROPDOWN_BASE_SPAN(StringValues.COMBO_DROPDOWN_BASE_SPAN),
    COMBO_DROPDOWN_TOGGLE_BUTTON_SPAN(StringValues.COMBO_DROPDOWN_TOGGLE_BUTTON_SPAN),
    COMBO_DROPDOWN_MENU_OPTION(StringValues.COMBO_DROPDOWN_MENU_OPTION),
    PORTLET_LOADING_ANIMATION(StringValues.PORTLET_LOADING_ANIMATION),
    PORTLET_BODY_SECTION_BASE_DIV(StringValues.PORTLET_BODY_SECTION_BASE_DIV),
    PORTLET_SECTION_EXPAND_BUTTON(StringValues.PORTLET_SECTION_EXPAND_BUTTON),
    PORTLET_SECTION_EXPAND_TEXT(StringValues.PORTLET_SECTION_EXPAND_TEXT),
    PORTLET_SECTION_LOADING_ANIMATION(StringValues.PORTLET_SECTION_LOADING_ANIMATION),
    CONTEXT_INFO_ICON(StringValues.CONTEXT_INFO_ICON),
    SEND_TO_NEXT_STEP_BUTTON(StringValues.SEND_TO_NEXT_STEP_BUTTON),
    TEXT_AREA_BY_TITLE(StringValues.TEXT_AREA_BY_TITLE),
    COMBO_BOX_DROPDOWN_INPUT(StringValues.COMBO_BOX_DROPDOWN_INPUT),
    TEXT_AREA(StringValues.TEXT_AREA),
    POPOVER_LISTBOX_ELEMENTS(StringValues.POPOVER_LISTBOX_ELEMENTS),
    HEADER_MENU_DROPDOWN_BUTTON(StringValues.HEADER_MENU_DROPDOWN_BUTTON),
    HOMEPAGE_TILE(StringValues.HOMEPAGE_TILE),
    SAP_OPENED_DIALOG_POP_UP_HEADER(StringValues.SAP_OPENED_DIALOG_POP_UP_HEADER),
    SAP_OPENED_DIALOG_POP_UP_BASE_DIV(StringValues.SAP_OPENED_DIALOG_POP_UP_BASE_DIV),
    SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT(StringValues.SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT),
    RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV(StringValues.RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV),
    PORTLET_SECTION_FIELD_VALUE(StringValues.PORTLET_SECTION_FIELD_VALUE),
    SAP_OPENED_DIALOG_POP_UP_LOADING_ANIMATION_DIV(StringValues.SAP_OPENED_DIALOG_POP_UP_LOADING_ANIMATION_DIV),
    H1_BY_TEXT(StringValues.H1_BY_TEXT),
    JOB_REQUISITION_BODY_TABLE(StringValues.JOB_REQUISITION_BODY_TABLE),
    ROUTE_MAP_BASE_DIV(StringValues.ROUTE_MAP_BASE_DIV),
    JOB_REQUISITION_INFORMATION_BASE_DIV(StringValues.JOB_REQUISITION_INFORMATION_BASE_DIV),
    STEPS_CHART_CONTAINER_DIV(StringValues.STEPS_CHART_CONTAINER_DIV),
    ROUTE_MAP_CURRENT_STATUS_STEP_DIV(StringValues.ROUTE_MAP_CURRENT_STATUS_STEP_DIV),
    A_SPAN_BY_TEXT(StringValues.A_SPAN_BY_TEXT),
    FIELD_TR_BY_LABEL_TEXT(StringValues.FIELD_TR_BY_LABEL_TEXT),
    JOB_DESCRIPTION_PRINT_PREVIEW_JOB_REQ_TITLE_LABEL(StringValues.JOB_DESCRIPTION_PRINT_PREVIEW_JOB_REQ_TITLE_LABEL),
    ROUTE_MAP_CHART_STEP_ITEM_BASE_LI(StringValues.ROUTE_MAP_CHART_STEP_ITEM_BASE_LI),
    ROUTE_MAP_INFO_ICON(StringValues.ROUTE_MAP_INFO_ICON),
    DIALOG_BASE_DIV(StringValues.DIALOG_BASE_DIV),
    JOB_REQUISITION_DETAIL_FIELD_BASE_DIV(StringValues.JOB_REQUISITION_DETAIL_FIELD_BASE_DIV),
    JOB_PROFILE_HYPER_LINK(StringValues.JOB_PROFILE_HYPER_LINK),
    JOB_PROFILE_SECTION_WRAPPER_DIV(StringValues.JOB_PROFILE_SECTION_WRAPPER_DIV),
    JOB_PROFILE_SECTION_WRAPPER_DIV_BY_INNER_TEXT(StringValues.JOB_PROFILE_SECTION_WRAPPER_DIV_BY_INNER_TEXT),
    JOB_PROFILE_FORM_BASE_DIV(StringValues.JOB_PROFILE_FORM_BASE_DIV),
    TASK_NAV_SPAN(StringValues.TASK_NAV_SPAN),
    INPUT_BUTTON_BY_VALUE(StringValues.INPUT_BUTTON_BY_VALUE),
    BUTTON_BY_INNER_TEXT(StringValues.BUTTON_BY_INNER_TEXT),
    DIALOG_BOX_BASE_DIV(StringValues.DIALOG_BOX_BASE_DIV),
    SORT_UP_BUTTON_A(StringValues.SORT_UP_BUTTON_A),
    SORT_DOWN_BUTTON_A(StringValues.SORT_DOWN_BUTTON_A),
    ADD_SECTION_DIV(StringValues.ADD_SECTION_DIV),
    MENU_ITEM_A_BY_INNER_TEXT(StringValues.MENU_ITEM_A_BY_INNER_TEXT),
    HEADER_PHOTO_NAME(StringValues.HEADER_PHOTO_NAME),
    UPDATE_JOB_ROLE_LEFT_PANEL_ROLE_ITEM_A(StringValues.UPDATE_JOB_ROLE_LEFT_PANEL_ROLE_ITEM_A),
    JOB_FAMILY_SELECT(StringValues.JOB_FAMILY_SELECT),
    SF_OVERLAY_CONTAINER(StringValues.SF_OVERLAY_CONTAINER),
    OPEN_QUESTIONS_LINK(StringValues.OPEN_QUESTIONS_LINK),
    CREATE_QUESTION_BOX_DIV(StringValues.CREATE_QUESTION_BOX_DIV),
    SELECTED_QUESTIONS_ROWS(StringValues.SELECTED_QUESTIONS_ROWS),
    INPUT_BUTTON_BY_TITLE(StringValues.INPUT_BUTTON_BY_TITLE),
    A_BY_TEXT(StringValues.A_BY_TEXT),
    FIND_EMPLOYEE_FIELD_BASE_DIV_BY_LABEL_TEXT(StringValues.FIND_EMPLOYEE_FIELD_BASE_DIV_BY_LABEL_TEXT),
    FIND_EMPLOYEE_BASE_DIV(StringValues.FIND_EMPLOYEE_BASE_DIV),
    SELECT_A_USER_RADIO_BTN(StringValues.SELECT_A_USER_RADIO_BTN),
    COMPANY_ID_INPUT(StringValues.COMPANY_ID_INPUT),
    SF_LIST_SELECT_OPTION_LI(StringValues.SF_LIST_SELECT_OPTION_LI),
    POSITION_ID_SELECT_DROPDOWN_BASE_SPAN(StringValues.POSITION_ID_SELECT_DROPDOWN_BASE_SPAN),
    FIELD_TR_BY_LABEL_ID(StringValues.FIELD_TR_BY_LABEL_ID),
    QUESTION_BROWSE_SECTION_BY_TEXT(StringValues.QUESTION_BROWSE_SECTION_BY_TEXT),
    BROWSE_LINE_ITEMS_CHECKBOX(StringValues.BROWSE_LINE_ITEMS_CHECKBOX),
    BROWSER_BOX_BASE_DIV(StringValues.BROWSER_BOX_BASE_DIV),
    DOCUMENTS_OVERLAY_DIALOG_BOX(StringValues.DOCUMENTS_OVERLAY_DIALOG_BOX),
    LIST_BOX_ELEMENT_OPTION_BY_TEXT(StringValues.LIST_BOX_ELEMENT_OPTION_BY_TEXT),
    POPOVER_USER_FULL_NAME_HEADER(StringValues.POPOVER_USER_FULL_NAME_HEADER),
    JOB_REQUISITION_TAB_BY_INNER_TEXT(StringValues.JOB_REQUISITION_TAB_BY_INNER_TEXT),
    JOB_POSTING_ROW_BY_INNER_TEXT(StringValues.JOB_POSTING_ROW_BY_INNER_TEXT),
    JOB_POSTING_ROWS(StringValues.JOB_POSTING_ROWS),
    JOB_SEARCH_RESULTS_ROW(StringValues.JOB_SEARCH_RESULTS_ROW),
    DROPDOWN_POP_OVER_OPTION_A_BY_TEXT(StringValues.DROPDOWN_POP_OVER_OPTION_A_BY_TEXT),
    AGENCY_POSTING_ROW_BY_INNER_TEXT(StringValues.AGENCY_POSTING_ROW_BY_INNER_TEXT),
    POSITION_ORG_CHART_ZOOM_OUT_BUTTON_SPAN(StringValues.POSITION_ORG_CHART_ZOOM_OUT_BUTTON_SPAN),
    ORG_CHART_HORIZONTAL_SLIDER(StringValues.ORG_CHART_HORIZONTAL_SLIDER),
    ORG_CHART_BASE_DIV(StringValues.ORG_CHART_BASE_DIV),
    ERROR_DIALOG_BASE_DIV(StringValues.ERROR_DIALOG_BASE_DIV),
    HOC_NODE_BODY_BASE_DIV_BY_TEXT(StringValues.HOC_NODE_BODY_BASE_DIV_BY_TEXT),
    H2_BY_TEXT(StringValues.H2_BY_TEXT),
    FILTER_OPTIONS_BUTTON(StringValues.FILTER_OPTIONS_BUTTON),
    FILTER_OPTIONS_REQUISITION_ID_INPUT(StringValues.FILTER_OPTIONS_REQUISITION_ID_INPUT),
    BUTTON_INPUT(StringValues.BUTTON_INPUT),
    HEADER_SEARCH_BAR_INPUT(StringValues.HEADER_SEARCH_BAR_INPUT),
    HEADER_SEARCH_RESULT_LIST(StringValues.HEADER_SEARCH_RESULT_LIST),
    EFFECTIVE_DATE(StringValues.EFFECTIVE_DATE),
    ASSIGNMENTESTIMATEDENDDATE_FIELD(StringValues.ASSIGNMENTESTIMATEDENDDATE_FIELD),
    SPAN_BY_TEXT(StringValues.SPAN_BY_TEXT),
    SPAN_BY_TITLE(StringValues.SPAN_BY_TITLE),
    INFORMATION_POP_UP_MESSAGE_BASE_DIV(StringValues.INFORMATION_POP_UP_MESSAGE_BASE_DIV),
    INFORMATION_POP_UP_MESSAGE(StringValues.INFORMATION_POP_UP_MESSAGE),
    ACCEPT_MATCH_IGNORE_MATCHES_BUTTON(StringValues.ACCEPT_MATCH_IGNORE_MATCHES_BUTTON),
    NEW_RECRUIT_NAME(StringValues.NEW_RECRUIT_NAME),
    LOAD_MORE_BUTTON(StringValues.LOAD_MORE_BUTTON),
    HEADER_SEARCH_RESULT_LIST_ACTION(StringValues.HEADER_SEARCH_RESULT_LIST_ACTION),
    DELETE_BUTTON_ON_PORTLET_TABLE(StringValues.DELETE_BUTTON_ON_PORTLET_TABLE),
    ADDRESS_CONTRACTUAL_FIELD(StringValues.ADDRESS_CONTRACTUAL_FIELD),
    FIELD_INPUT(StringValues.FIELD_INPUT),
    FIELD_INPUT_DROPDOWN_TOGGLE_ICON(StringValues.FIELD_INPUT_DROPDOWN_TOGGLE_ICON),
    DROPDOWN_RESULT(StringValues.DROPDOWN_RESULT),
    DIALOG_BASE_LOADING_ICON(StringValues.DIALOG_BASE_LOADING_ICON),
    HEADER_SEARCH_RESULT_NAME(StringValues.HEADER_SEARCH_RESULT_NAME),
    PENDING_HIRE_EFFECTIVE_EVENT_DATE(StringValues.PENDING_HIRE_EFFECTIVE_EVENT_DATE),
    EMPLOYEE_NAME_DRAFTS(StringValues.EMPLOYEE_NAME_DRAFTS),
    INACTIVE_EMPLOYEE_NAMES(StringValues.INACTIVE_EMPLOYEE_NAMES),
    INACTIVE_EMPLOYEE_SEARCH_BOX(StringValues.INACTIVE_EMPLOYEE_SEARCH_BOX),
    ADVANCED_SEARCH_LOCATION(StringValues.ADVANCED_SEARCH_LOCATION),
    ACTIVE_EMPLOYEE_NAME(StringValues.ACTIVE_EMPLOYEE_NAME),
    WORKFLOW_REQUEST(StringValues.WORKFLOW_REQUEST),
    OLD_VALUE_BY_SPAN(StringValues.OLD_VALUE_BY_SPAN),
    NEW_VALUE_BY_SPAN(StringValues.NEW_VALUE_BY_SPAN),
    DIV_BY_TEXT(StringValues.DIV_BY_TEXT),
    FOOTER_BUTTON(StringValues.FOOTER_BUTTON),
    NEW_REPORT_BASE_DIV(StringValues.NEW_REPORT_BASE_DIV),
    REPORT_TYPE(StringValues.REPORT_TYPE),
    SELECT_DOMAIN_STRUCTURE(StringValues.SELECT_DOMAIN_STRUCTURE),
    DESCRIBE_YOUR_REPORT_DROPDOWN_FIELDS(StringValues.DESCRIBE_YOUR_REPORT_DROPDOWN_FIELDS),
    DESCRIBE_YOUR_REPORT_TEXTAREA(StringValues.DESCRIBE_YOUR_REPORT_TEXTAREA),
    REMOVE_STYLING_CHECKBOX(StringValues.REMOVE_STYLING_CHECKBOX),
    REPORT_STEP_WIZARD(StringValues.REPORT_STEP_WIZARD),
    DOMAIN_TITLE(StringValues.DOMAIN_TITLE),
    REPORT_STEP_BUTTON(StringValues.REPORT_STEP_BUTTON),
    TEAM_REPORTING_TYPE_RADIO_BUTTON(StringValues.TEAM_REPORTING_TYPE_RADIO_BUTTON),
    SELECT_COLUMN_CHECKBOX(StringValues.SELECT_COLUMN_CHECKBOX),
    SELECTED_COLUMN_LIST(StringValues.SELECTED_COLUMN_LIST),
    BY_MY_SELECTION_RADIO_BUTTON(StringValues.BY_MY_SELECTION_RADIO_BUTTON),
    REPORTING_SF_DIALOG_BOX(StringValues.REPORTING_SF_DIALOG_BOX),
    REPORT_TOOLBAR(StringValues.REPORT_TOOLBAR),
    REPORTS_LIST_BASE_DIV(StringValues.REPORTS_LIST_BASE_DIV),
    REPORTS_LIST_PERFORM_ACTION_BUTTON(StringValues.REPORTS_LIST_PERFORM_ACTION_BUTTON),
    REPORTS_PERFORM_ACTION_MENU_LIST_ITEM(StringValues.REPORTS_PERFORM_ACTION_MENU_LIST_ITEM),
    SEARCH_REPORT(StringValues.SEARCH_REPORT),
    SEARCH_REPORT_ICON(StringValues.SEARCH_REPORT_ICON),
    PENDING_REQUESTS_PORTLETS(StringValues.PENDING_REQUESTS_PORTLETS),
    PORTLET_BASE_DIV(StringValues.PORTLET_BASE_DIV),
    LAYOUT_CONTAINER(StringValues.LAYOUT_CONTAINER),
    COMPANY_PROCESS_ICON(StringValues.COMPANY_PROCESS_ICON),
    COMPANY_PROCESS_LABEL(StringValues.COMPANY_PROCESS_LABEL),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON_NAME(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON_NAME),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_CREATE_NEW(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_CREATE_NEW),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_LIST_BOX(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_LIST_BOX),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_FIELD(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_FIELD),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_EFFECTIVE_DATE(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_EFFECTIVE_DATE),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_RECORDED_FIELD_LABEL(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_RECORDED_FIELD_LABEL),
    MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_PORTLET_HEADER_BASE_DIV(StringValues.MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_PORTLET_HEADER_BASE_DIV),
    ADMIN_FAVOURITES_STAR_ICON(StringValues.ADMIN_FAVOURITES_STAR_ICON),
    POSITION_FIELD(StringValues.POSITION_FIELD),
    MANAGE_DATA_CREATE_NEW_OBJECT(StringValues.MANAGE_DATA_CREATE_NEW_OBJECT),
    MANAGE_DATA_SEARCH_OBJECT(StringValues.MANAGE_DATA_SEARCH_OBJECT),
    MANAGE_DATA_SEARCH_OBJECT_NAME(StringValues.MANAGE_DATA_SEARCH_OBJECT_NAME),
    MANAGE_DATA_FIELD(StringValues.MANAGE_DATA_FIELD),
    MANAGE_DATA_FIELD_LABEL(StringValues.MANAGE_DATA_FIELD_LABEL),
    SAP_UI_LOADING_INDICATOR(StringValues.SAP_UI_LOADING_INDICATOR),
    REQUESTS_APPROVAL_TILE(StringValues.REQUESTS_APPROVAL_TILE),
    VIEW_ALL_APPROVALS(StringValues.VIEW_ALL_APPROVALS),
    APPROVAL_CARD_WORKFLOW(StringValues.APPROVAL_CARD_WORKFLOW),
    PAGE_SUB_SECTION(StringValues.PAGE_SUB_SECTION),
    HYPERLINK_BY_TEXT(StringValues.HYPERLINK_BY_TEXT),
    CREATE_ABSENCE_NAV_CON_BASE_DIV(StringValues.CREATE_ABSENCE_NAV_CON_BASE_DIV),
    FORM_GENERATOR_FIELD_BASE_DIV(StringValues.FORM_GENERATOR_FIELD_BASE_DIV),
    DROPDOWN_MENU_OPTION(StringValues.DROPDOWN_MENU_OPTION),
    POPUP_MESSAGE_BASE_DIV(StringValues.POPUP_MESSAGE_BASE_DIV),
    TR_SPAN_BY_TEXT(StringValues.TR_SPAN_BY_TEXT),
    TD_BY_CLASS(StringValues.TD_BY_CLASS),
    WF_TABLEROW(StringValues.WF_TABLEROW),
    LI_CONTAINER(StringValues.LI_CONTAINER),
    ABSENCES_AND_HOLIDAYS_DIALOG_BOX(StringValues.ABSENCES_AND_HOLIDAYS_DIALOG_BOX),
    SEGMENT_BAR(StringValues.SEGMENT_BAR),
    BALANCES_PANEL_BASE_DIV(StringValues.BALANCES_PANEL_BASE_DIV),
    APPROVED_ABSENCE(StringValues.APPROVED_ABSENCE),
    UPCOMING_TIME_OFF_PANEL_BASE_DIV(StringValues.UPCOMING_TIME_OFF_PANEL_BASE_DIV),
    PANEL_CONTENT(StringValues.PANEL_CONTENT),
    CHECKBOX(StringValues.CHECKBOX);

    private final String value;

    Selectors(String value) {
        this.value = value;
    }


    public String getValue () {
        return value;
    }

    public String getValue (String value) {
        return this.value.replace("[TEXT_TO_REPLACE]", value);
    }

    public By getBy () {
        if (this.value.startsWith("//")|| this.value.startsWith("./")) {
            return By.xpath(this.value);
        }
        return By.cssSelector(this.value);
    }

    public By getBy (String value) {
        value = value.toLowerCase();
        if (this.value.contains("//") || this.value.contains("./")) {
            return By.xpath(this.value.replace("[TEXT_TO_REPLACE]", value));
        }
        return By.cssSelector(this.value.replace("[TEXT_TO_REPLACE]", value));
    }

    private static class StringValues {
        //LoginPage
        private static final String USERNAME_INPUT = "//input[@name = 'username']";
        private static final String PASSWORD_INPUT = "//input[@name = 'password']";
        private static final String LOGIN_BUTTON = "//button[.//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'log in')]]";
        private static final String USER_HEADER_PHOTO_NAME = "//div[@class = 'surjUserPhotoName']";

        //GenericPage
        private static final String HEADER_MODULE_PICKER_BUTTON = "//button[@id = 'customHeaderModulePickerBtn']";
        private static final String HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV = "//div[@id = 'customHeaderModulePickerBtn-menuPopover']";
        private static final String HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR = HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV + "//ul/a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String LOADING_ICON = "//div[@id = 'sfLoadBlockerLayer']";
        private static final String LABELED_BUTTON = ".//button[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String COMBO_DROPDOWN_BASE_SPAN = ".//span[contains(@class, 'comboDropDown')]";
        private static final String COMBO_BOX_DROPDOWN_INPUT = ".//input[@role = 'combobox']";
        private static final String COMBO_DROPDOWN_MENU_OPTION = ".//div[contains(@class, 'globalMenu')]//li[@role = 'option' and .//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String COMBO_DROPDOWN_TOGGLE_BUTTON_SPAN = COMBO_DROPDOWN_BASE_SPAN + "//span[@class = 'toggle']";
        private static final String TEXT_AREA_BY_TITLE = ".//textarea[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String TEXT_AREA = ".//textarea";
        private static final String INPUT_BUTTON_BY_TITLE = ".//button[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String LIST_BOX_ELEMENT_OPTION_BY_TEXT = ".//ul[@role = 'listbox']//li[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//div[@role = 'menu']//div[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String ERROR_DIALOG_BASE_DIV = "//div[@id = 'ajaxErrorDialog']";
        private static final String FOOTER_BUTTON = "//footer//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String HYPERLINK_BY_TEXT = ".//a[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";

        //OrganisationInfoPage
        private static final String ORGANISATION_INFO_MAIN_CONTENT_BASE_DIV = "//div[@id = 'content']";
        private static final String ORGANISATION_INFO_HEADER_TAB_BASE_DIV = "//div[@id = 'surjSubTabBar']";
        private static final String ORGANISATION_INFO_HEADER_TAB_ANCHOR = ORGANISATION_INFO_HEADER_TAB_BASE_DIV + "//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String HIERARCHY_CHART_BASE_DIV = "//div[contains(@class, 'hierarchyChart')]";
        private static final String ORGANISATION_INFO_LOADING_SHIM = "//div[@class = 'loadingShim'] | //div[@class = 'overlayShim']";
        private static final String HOC_NODE_BODY_BASE_DIV = "//div[@class = 'hoc-node-body']";
        private static final String HOC_NODE_BODY_BASE_DIV_BY_TEXT = "//div[@class = 'hoc-node-body' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String JOB_REQUISITION_APPROVED_ICON = ".//a[@title = 'Job Requisition - Status approved' or @title = 'Job Requisition - Status pre-approved'] | .//span[@title = 'Job Requisition - Status approved' or @title = 'Job Requisition - Status pre-approved']";
        private static final String HOC_NODE_ICON_SECTION_DIV = HOC_NODE_BODY_BASE_DIV + "//div[contains(@class, 'hoc-poc-icon-section')]";
        private static final String ORG_CHART_POSITION_TITLE_ANCHOR = ".//a[contains(@class, 'hoc-title-area') and .//div[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'position code') and ./*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]]";
        private static final String PORTLET_BODY_BASE_DIV = "//div[contains(@class ,'panelContent globalPortletBody')]";
        private static final String PORTLET_HEADER_BASE_DIV = "//div[contains(@class, 'panelHeader globalPortletHeader')]";
        private static final String PORTLET_HEADER_TITLE = PORTLET_HEADER_BASE_DIV + "//span[@class = 'panelHeaderTitle']";
        private static final String PORTLET_SHOW_MENU_ANCHOR = PORTLET_BODY_BASE_DIV + "//a[@title = 'Show Menu'] | //a[@title = 'Actions']";
        private static final String PORTLET_MENU_ANCHOR = PORTLET_BODY_BASE_DIV + "//div[contains(@class, 'globalMenu sfDropMenu menuDefault')]//a[@role = 'menuitem']//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String PORTLET_BODY_SECTION_BASE_DIV = ".//div[./div[@class = 'hoc-expandable-section-header' and .//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]]";
        private static final String PORTLET_SECTION_EXPAND_BUTTON = PORTLET_BODY_SECTION_BASE_DIV + "//a[contains(@id, 'expandbutton')]";
        private static final String PORTLET_SECTION_EXPAND_TEXT = PORTLET_BODY_SECTION_BASE_DIV + "//a[contains(@id, 'expandtext')]";
        private static final String SHOW_POSITION_ICON = "//a[contains(@title , 'Show Position')] | //button[contains(@title , 'Show Position')] | //button[contains(text(),'Show Details')]";
        private static final String OVERLAY_PORTLET_TD_FIELD_VALUE = "//div[contains(@class, 'sfoverlaycontainer')]//table/tbody/tr[./td[.//*[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']]]/td[2]//div[contains(@class, 'fieldWithOldValue')]/span[1]";
        private static final String CLOSE_ICON = "//a[./span[@class = 'sapIcon']]";
        private static final String OVERLAY_LOADING_ANIMATION = "//div[contains(@class, 'sfoverlaycontainer') and ./div[contains(@class, 'juicBusyIndicatorAnimation')]]";
        private static final String PORTLET_LOADING_ANIMATION = ".//div[contains(@id, 'content') and ./div[contains(@class, 'juicBusyIndicatorAnimation')]]";
        private static final String PORTLET_SECTION_LOADING_ANIMATION = PORTLET_BODY_SECTION_BASE_DIV + "//div[contains(@class, 'hoc-sidepanel-loading-indicator') and ./div[contains(@class, 'juicBusyIndicatorAnimation')]]";
        private static final String CONTEXT_INFO_ICON = ".//a[./span[@class = 'context_icon info']]";
        private static final String SEND_TO_NEXT_STEP_BUTTON = "//button[contains(@onclick, '_next_step')]";
//        private static final String SF_LIST_SELECT_OPTION_LI = ".//ul[contains(@class,'sf-list-select')]//li[@role = 'option' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
private static final String SF_LIST_SELECT_OPTION_LI = ".//li[@role = 'option' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String POSITION_ID_SELECT_DROPDOWN_BASE_SPAN = ".//span[contains(@class, 'positionselect')]";
        private static final String POSITION_ORG_CHART_ZOOM_OUT_BUTTON_SPAN = "//a[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'zoom out ')]";
        private static final String ORG_CHART_BASE_DIV = ".//div[@id = 'orgchart']";
        private static final String ORG_CHART_HORIZONTAL_SLIDER = ".//a[contains(@id, 'horizontal') and @role = 'slider'] | .//a[contains(@id, 'horizontal') and @role = 'scrollbar']";
        private static final String POSITION_FIELD = "//tr[contains(@class,'form_field ') and .//span[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']]";

        //HeaderPage
        private static final String HEADER_MENU_DROPDOWN_BUTTON = ".//button[@id = 'utilityLinksMenuId']";
        private static final String POPOVER_LISTBOX_ELEMENTS = ".//ul[@role = 'listbox']//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String HEADER_PHOTO_NAME = ".//div[@class = 'surjUserPhotoName'] || .//img[@class = 'surjUserPhotoImg']";
        private static final String POPOVER_USER_FULL_NAME_HEADER = "//header[@class = 'sapMPopoverHeader']";
        private static final String HEADER_SEARCH_BAR_INPUT = "//input[@id = 'bizXSearchField-I']";
        private static final String HEADER_SEARCH_RESULT_LIST = "//div[contains(@id, '__popover') and @role = 'dialog']//li[@role = 'option']";
        private static final String HEADER_SEARCH_RESULT_LIST_ACTION = " //div[contains(@id, '__popover') and @role = 'dialog']//li[translate(. ,'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']";
        private static final String HEADER_SEARCH_RESULT_NAME = "//div[contains(@id, '__popover') and @role = 'dialog']//li[@role = 'option']//span[translate(. ,'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']//b";

        //HomePage
//        private static final String HOMEPAGE_TILE = ".//ul[contains(@class, 'TilesContainer')]//li[contains(@id, 'tile') and .//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String HOMEPAGE_TILE = ".//button[contains(@class,'ActionChip')]//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//a[contains(@class,'ActionChip')] //span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//a[contains(@class,'ActionChip') and contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] ";
        private static final String REQUESTS_APPROVAL_TILE = "//div[contains(@class,'Masonry_tile')]//div[contains(@class,'ApprovalCard_body')] | //div[contains(@class,'ApprovalCard_body')] | //div[contains(@class,'Masonry_tile')]//div[contains(@class,'ApprovalFooter')]//ui5-button[contains(@class,'globalCardButton')]";
        private static final String VIEW_ALL_APPROVALS = "//div[contains(@class,'Masonry_tile')]//div[contains(@class,'ApprovalFooter')]//ui5-button[contains(@class,'globalCardButton')]";

        private static final String SAP_OPENED_DIALOG_POP_UP_BASE_DIV = "//div[contains(@class, 'sapMDialog') and contains(@class, 'sapMDialogOpen')]";
        private static final String SAP_OPENED_DIALOG_POP_UP_HEADER = SAP_OPENED_DIALOG_POP_UP_BASE_DIV + "//header";
        private static final String SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT = "//div[contains(@class, 'sapMDialog') and contains(@class, 'sapMDialogOpen') and .//header[.//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]]";
//        private static final String RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV = ".//section//tbody//tr//td//div[contains(@class, 'sapMHBox')]";
        private static final String RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV = ".//section//ul//li//div[contains(@class, 'sapMHBox')]";
        private static final String PORTLET_SECTION_FIELD_VALUE = ".//tr[./td[@class = 'sidepaneldetailsectionlabel' and translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']]/td[@class = 'sidepaneldetailsectionvalue']";
        private static final String SAP_OPENED_DIALOG_POP_UP_LOADING_ANIMATION_DIV = SAP_OPENED_DIALOG_POP_UP_BASE_DIV +"//div[contains(@class, 'sapUiLocalBusyIndicatorAnimation')]";
        private static final String WORKFLOW_REQUEST = ".//div[contains(@class,'sapMDialog ') and .//span[contains(text(),'Approve Requests')]]//tbody//tr//td[2]//a[contains(normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')),'[TEXT_TO_REPLACE]')]";
        private static final String ADMIN_FAVOURITES_STAR_ICON = "//div[contains(@class, 'sapMDialog') and contains(@class, 'sapMDialogOpen')]//li[contains(@role,'option') and .//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]//div[contains(@class,'RatingIndicator')]//div[contains(@class,'sapMRISel')]//span";

        //RecruitingPage
        private static final String H1_BY_TEXT = ".//h1[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String JOB_REQUISITION_BODY_TABLE = ".//div[contains(@aria-label, 'Job Requisition Summary Grid table')]//div[contains(@id, 'bodyInnerDiv')]//table";
        private static final String ROUTE_MAP_BASE_DIV = ".//div[@id = 'routeMap']";
        private static final String JOB_REQUISITION_INFORMATION_BASE_DIV = "//div[@aria-label = 'Job Requisition Information'] | //div[contains(@aria-label , 'Job Requisition Information')]";
        private static final String STEPS_CHART_CONTAINER_DIV = ".//div[contains(@id, 'stepsChartContainer')]";
        private static final String ROUTE_MAP_CURRENT_STATUS_STEP_DIV = ".//li[contains(@class, 'sfStepsChartSelected')]//div[contains(@id, 'stepsChartStepName')]";
        private static final String A_SPAN_BY_TEXT = "//a[./span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String FIELD_TR_BY_LABEL_TEXT = ".//tr[./th[@class = 'formFieldLabel']//label[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String FIELD_TR_BY_LABEL_ID = ".//tr[./th[@class = 'formFieldLabel']//label[contains(translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String JOB_DESCRIPTION_PRINT_PREVIEW_JOB_REQ_TITLE_LABEL = "//label[@id = 'jobreq_print_title']";
        private static final String ROUTE_MAP_CHART_STEP_ITEM_BASE_LI = ".//li[contains(@class, 'sfStepsChartStepItem')]";
        private static final String ROUTE_MAP_INFO_ICON = ".//button[contains(@id, 'routMapInfoIcon')]";
        private static final String DIALOG_BASE_DIV = ".//div[@role = 'dialog']";
        private static final String JOB_REQUISITION_DETAIL_FIELD_BASE_DIV = ".//div[@class = 'formSectionBody' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'job requisition detail')]";
        private static final String JOB_PROFILE_HYPER_LINK = "//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'job profile') or contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'job description')]  | //span[contains(text(),'View Job Profile')]";
        private static final String JOB_PROFILE_SECTION_WRAPPER_DIV = ".//div[@class = 'section_wrapper']";
        private static final String JOB_PROFILE_SECTION_WRAPPER_DIV_BY_INNER_TEXT = ".//div[@class = 'section_wrapper' and .//span[@class = 'section-name' and h2[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]]";
        private static final String JOB_PROFILE_FORM_BASE_DIV = ".//div[@id = 'formBgJobProfile']";
        private static final String TASK_NAV_SPAN = ".//div[@class = 'tasknav']/span[./a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String INPUT_BUTTON_BY_VALUE = ".//input[@type = 'button' and contains(translate(@value, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String BUTTON_BY_INNER_TEXT = ".//button[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]') or contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String DIALOG_BOX_BASE_DIV = ".//div[contains(@id, 'dialogBox')]";
        private static final String SORT_UP_BUTTON_A = ".//a[contains(@class, 'sort-up-button')]";
        private static final String SORT_DOWN_BUTTON_A = ".//a[contains(@class, 'sort-down-button')]";
        private static final String ADD_SECTION_DIV = ".//div[contains(@class,'menu-button-add')]";
        private static final String MENU_ITEM_A_BY_INNER_TEXT = ".//div[contains(@class, 'sfDropMenu')]//a[@role = 'menuitem' and contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//div[contains(@class, 'sfDropMenu')]//a[@role = 'menuitem']//span[ contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String UPDATE_JOB_ROLE_LEFT_PANEL_ROLE_ITEM_A = ".//td[@class = 'leftPannel']//div[@class = 'roleItem' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]//a";
        private static final String JOB_FAMILY_SELECT = ".//select[@name = 'JDM Family List']";
        private static final String SF_OVERLAY_CONTAINER = ".//div[contains(@class, 'sfoverlaycontainer')]";
        private static final String OPEN_QUESTIONS_LINK = ".//a[@id = 'open_questions_link']";
        private static final String CREATE_QUESTION_BOX_DIV = ".//div[@id = 'createBox']";
        private static final String SELECTED_QUESTIONS_ROWS = ".//tr[contains(@id, 'selectedQuestion')]";
        private static final String A_BY_TEXT = ".//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')] | .//a[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String FIND_EMPLOYEE_BASE_DIV = ".//div[@role= 'dialog' and .//header[contains(., 'Find Employee')]]";
        private static final String FIND_EMPLOYEE_FIELD_BASE_DIV_BY_LABEL_TEXT = FIND_EMPLOYEE_BASE_DIV + "//div[contains(@id, 'container') and contains(@class, 'Field') and .//label[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String SELECT_A_USER_RADIO_BTN = ".//tr[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]//div[./input[@type = 'radio']]";
        private static final String QUESTION_BROWSE_SECTION_BY_TEXT = ".//table[@class = 'browseTable']//a[translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']";
        private static final String BROWSE_LINE_ITEMS_CHECKBOX = ".//div[contains(@class, 'browseLineItem')]//label";
        private static final String BROWSER_BOX_BASE_DIV = ".//div[@id = 'browseBox']";
        private static final String DOCUMENTS_OVERLAY_DIALOG_BOX = ".//div[contains(@id, 'overlay') and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'documents')]";
        private static final String JOB_REQUISITION_TAB_BY_INNER_TEXT = ".//div[@class = 'tasknav']/span[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String JOB_POSTING_ROW_BY_INNER_TEXT = ".//div[@aria-label = 'Grid JOB ADVERTISEMENT']//tr[td[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String JOB_POSTING_ROWS = ".//div[@aria-label = 'Grid JOB ADVERTISEMENT']//tr";
        private static final String AGENCY_POSTING_ROW_BY_INNER_TEXT = ".//table[contains(@aria-label, 'Agency posting')]//tbody//tr[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String H2_BY_TEXT = ".//h2[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String FILTER_OPTIONS_BUTTON = ".//button[@aria-label = 'Filter Options']";
        private static final String FILTER_OPTIONS_REQUISITION_ID_INPUT = ".//tr[.//td[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),  'job requisition id')]][1]//input";
        private static final String BUTTON_INPUT = "(.//button | .//input)[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]') or contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]') or contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]') or contains(translate(@value, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";

        //ReportingPage
        private static final String NEW_REPORT_BASE_DIV = "//div[contains(@class,'newReportDialog')]";
        private static final String REPORT_TYPE = "//section//div[contains(@class,'sapUiRespGridSpan') and .//span[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//img";
        private static final String SELECT_DOMAIN_STRUCTURE = "//section//div[contains(@class,'sapMFlexBox')]//div[contains(@class,'sapMRbHasLabel') and .//bdi[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//div";
        private static final String DESCRIBE_YOUR_REPORT_DROPDOWN_FIELDS = "//div[contains(@id,'revolution_content')]//tbody//tr[contains(@id,'rb') and .//td//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//td//input";
        private static final String DESCRIBE_YOUR_REPORT_TEXTAREA = "//tr[contains(@id,'rb') and .//td//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//td//textarea";
        private static final String REMOVE_STYLING_CHECKBOX = "//tr[contains(@id,'rb') and .//td//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//td//a";
        private static final String REPORT_STEP_WIZARD = "//div[contains(@class,'rbWizardContainer') and //div[contains(@class,'WizardStepsChartContainer')]]//div[contains(@class,'sfStepsChartContainer')]//ul//li//div[contains(@class,'StepsChartStepNamePosition') and contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String REPORT_STEP_BUTTON = "//div[contains(@class,'rbWizardContainer') and //div[contains(@class,'WizardStepsChartContainer')]]//div[contains(@class,'sfStepsChartContainer')]//ul//li//div[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]//span";
        private static final String DOMAIN_TITLE = "//tr[contains(@id,'rb') and .//td//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'domain')]]//td//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String TEAM_REPORTING_TYPE_RADIO_BUTTON = "//div[contains(@class,'sfDialogBox')]//tbody//tr//td//span[contains(@class,'radioCheck') and .//label[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]] | //div[contains(@class,'sfDialogBox')]//tbody//tr//td//div[contains(@class,'Radio')]//label[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String SELECT_COLUMN_CHECKBOX = "//div[contains(@class,'sfDialogBox') and //div[contains(@class,'panelContent')]]//div[contains(@class,'SelectionSection')]//ul//li//label[contains(@class,'sfCheckBoxEnabled') and .//label[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') ='[TEXT_TO_REPLACE]']]//a";
        private static final String SELECTED_COLUMN_LIST = "//div[contains(@class,'sfDialogBox') and //div[contains(@class,'panelContent')]]//div[contains(@class,'SelectedSection')]//ul//li//a[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']";
        private static final String BY_MY_SELECTION_RADIO_BUTTON = "//div[contains(@class,'sfDialogBox') and //div[contains(@class,'panelContent')]]//div[contains(@class,'rbFilterByMySelectionMode')]//label[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String REPORTING_SF_DIALOG_BOX = "//div[contains(@class,'sfDialogBox') and //div[contains(@class,'panelContent')]]";
        private static final String REPORT_TOOLBAR = "//div[contains(@class,'rbToolbarDiv')]//span//a//em[contains(@class,'globalIconFont') and .//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String REPORTS_LIST_BASE_DIV = "//tbody[contains(@class,'sapMListItems')]";
        private static final String REPORTS_LIST_PERFORM_ACTION_BUTTON = "//tbody[contains(@class,'sapMListItems')]//tr[contains(@class,'sapMListTblRow') and .//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]//button[contains(@title,'Perform Actions')]";
        private static final String REPORTS_PERFORM_ACTION_MENU_LIST_ITEM = "//div[contains(@class,'actionMenuList')]//ul//li[contains(@class,'ActionMenuListItem') and .//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String SEARCH_REPORT = "//div[contains(@class,'sapMBarChild')]//input[contains(@title,'Search')]";
        private static final String SEARCH_REPORT_ICON = "//div[contains(@id,'mainContainer')]//div[contains(@class,'sapMBarChild')]//div[contains(@title,'Search') and contains(@class,'sapMSFB')]";
        private static final String SAP_UI_LOADING_INDICATOR = "//div[contains(@class, 'sapUiLocalBusyIndicator') and ./div[contains(@class, 'BusyIndicatorAnimation')]]";

        //CompanyEntryPage
        private static final String COMPANY_ID_INPUT = ".//input[@placeholder = 'Enter Company ID']";

        //CareersPage
        private static final String JOB_SEARCH_RESULTS_ROW = ".//div[contains(@aria-label, 'Job Results')]//tr[@class = 'jobResultItem' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String DROPDOWN_POP_OVER_OPTION_A_BY_TEXT = "//ul[contains(@class , 'sf-PopMenu')]//li//a[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";

        //Pending Requests Page
        private static final String PENDING_REQUESTS_PORTLETS = "//div[contains(@class,'globalContainer') and .//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";

        //MyEmployeeFilePage
        private static final String PORTLET_BASE_DIV = "//div[contains(@class, 'sapUxAPBlockContainer') and .//div[@class = 'sfPeopleProfileBlockTitle' and .//span[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]]";
        private static final String PENDING_HIRE_EFFECTIVE_EVENT_DATE = "//div[contains(@class, 'sapMTBStandard') and .//bdi[contains(translate(translate(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', ''), '\u200B', ''), '[TEXT_TO_REPLACE]')]]//input";
        private static final String EFFECTIVE_DATE = ".//div[contains(@class, 'EffectiveDateVL') and .//bdi[contains(translate(translate(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', ''), '\u200B', ''), '[TEXT_TO_REPLACE]')]]//input";
        private static final String ASSIGNMENTESTIMATEDENDDATE_FIELD = ".//div[contains(@class,'FormGeneratorPanel') and .//span[contains(text(),'Job Information')]]//div[contains(@class,'GeneratorField') and .//bdi[contains(translate(translate(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', ''), '\u200B', ''), 'assignment estimated end date')]]//input";
        private static final String SPAN_BY_TEXT = ".//span[contains(translate(translate(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', ''), '\u200B', ''), '[TEXT_TO_REPLACE]')]";
        private static final String SPAN_BY_TITLE = ".//span[contains(@title,'[TEXT_TO_REPLACE]')]";
        private static final String INFORMATION_POP_UP_MESSAGE_BASE_DIV = "//div[contains(@class,'sapMMessageBox') and .//span[contains(text(),'Information')]]";
        private static final String INFORMATION_POP_UP_MESSAGE = INFORMATION_POP_UP_MESSAGE_BASE_DIV + "//li[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String FIELD_INPUT = ".//div[contains(@class, 'GeneratorField') and .//bdi[contains(translate(translate(translate(text(), '\u00AD', ''), '\u200B', ''),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]//input";
        private static final String FIELD_INPUT_DROPDOWN_TOGGLE_ICON = ".//div[contains(@class, 'GeneratorField') and .//bdi[contains(translate(translate(translate(text(), '\u00AD', ''), '\u200B', ''),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]//span[@role = 'button']";
        private static final String OLD_VALUE_BY_SPAN = "//span[contains(@class,'oldValue') and contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String NEW_VALUE_BY_SPAN = "//span[contains(@class,'newValue') and contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String DIV_BY_TEXT = ".//div[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String APPROVAL_CARD_WORKFLOW = "//div[contains(@id,'stackedCard') and .//div[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]//ui5-link";
        private static final String PAGE_SUB_SECTION = "//div[contains(@class,'PageSubSection')]//div[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='[TEXT_TO_REPLACE]']";

        //AddNewEmployeePage
        private static final String ACCEPT_MATCH_IGNORE_MATCHES_BUTTON = "//button//bdi[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String DELETE_BUTTON_ON_PORTLET_TABLE = "//div[contains(@class,'FormGenerator') and .//span[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'job relationships')]]//button[contains(.,'Delete')]";
        private static final String ADDRESS_CONTRACTUAL_FIELD = "//div[contains(@class,'FormGeneratorPanel') and .//span[contains(text(),'Contractual')]]//div[contains(@class,'GeneratorField') and .//bdi[contains(normalize-space(translate(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', '')), '[TEXT_TO_REPLACE]')]]//input | //div[contains(@class,'FormGeneratorPanel') and .//span[contains(text(),'Address')]]//div[contains(@class,'GeneratorField') and .//bdi[contains(normalize-space(translate(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '\u00AD', '')), '[TEXT_TO_REPLACE]')]]//input";

        //Manage Pending Recruits
        private static final String NEW_RECRUIT_NAME = "//tbody//tr[contains(@class,'sapMLIBTypeInactive') and .//div[contains(@class,'sapMFlexItemAlignAuto') and .//span[@title='[TEXT_TO_REPLACE]']]]//a";
        private static final String LOAD_MORE_BUTTON = "//button[contains(.,'Load More')]";
        private static final String DROPDOWN_RESULT = "//ul[contains(@class ,'sapMList')]//li[@role = 'option' and contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String DIALOG_BASE_LOADING_ICON = "//div[contains(@class,'sapMDialog') and //span[contains(text(),'')]]//section";
        private static final String EMPLOYEE_NAME_DRAFTS = "//tr[contains(@class,'ListTblRow') and .//td[contains(@class,'ListTblCell') and .//a[contains(normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')),'[TEXT_TO_REPLACE]')]]]";

        //Rehire Inactive Employee
        private static final String INACTIVE_EMPLOYEE_NAMES = "//div[contains(@class,'middle-row')]//tbody//tr//a";
        private static final String INACTIVE_EMPLOYEE_SEARCH_BOX = "//div[contains(@class,'searchBy') and //span[contains(text(),'Search by:')]]//input";

        //View employee directory - Advance Search
        private static final String ADVANCED_SEARCH_LOCATION = "//div[contains(@class,'directorysearchContainer') and //div[contains(@class,'surjContainer')]]//span[contains(.,'Location:')]//ancestor::div[contains(@class,'surjContainer')]//input";
        private static final String ACTIVE_EMPLOYEE_NAME = "//tbody//tr[contains(@class,'sapMLIBTypeInactive') and .//div[contains(@class,'sapMFlexItemAlignAuto')]]//td//a";

        //ADMIN CENTRE PAGE
        private static final String LAYOUT_CONTAINER = "//div[contains(@class,'adm-layout-container') and .//div[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String COMPANY_PROCESS_ICON = "//li[contains(translate(@title,'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]//a";
        private static final String COMPANY_PROCESS_LABEL = "//a[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON = "//table[contains(@class,'Search')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'Search')]]//input";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_SEARCH_EVENT_REASON_NAME = "//table[contains(@class,'Search')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'FOUNDATION_OBJECTS')]]//input";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_CREATE_NEW = "//table[contains(@class,'CreateNew')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'Create New')]]//span[contains(@class,'toggle')]";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_LIST_BOX = "//div[contains(@class,'sfoverlaycontainer') and //ul[contains(@class,'sf-list-select')]]//li//a[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]";

        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_FIELD = "//tr[contains(@class,'form_field ')]//label[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]//parent::td//parent::tr";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_EFFECTIVE_DATE = "//div[contains(@class,'effectiveDateContainerWrite')]//tbody//input";

        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_RECORDED_FIELD_LABEL = "//div[contains(@class, 'ectFormContainer globalContainer')]//tr[contains(@class,'form_field') and .//label[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String MANAGE_ORGANISATION_PAY_AND_JOB_STRUCTURE_PORTLET_HEADER_BASE_DIV = "//div[contains(@class, 'ectFormContainer globalContainer') and .//div[contains(@class,'TopHeader')]]";

        private static final String MANAGE_DATA_CREATE_NEW_OBJECT = "//div[contains(@class,'')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'Select an object type to create a new record')]]//input";
        private static final String MANAGE_DATA_SEARCH_OBJECT = "//div[contains(@class,'Search')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'Select an object type to display the records')]]//input";
        private static final String MANAGE_DATA_SEARCH_OBJECT_NAME = "//div[contains(@class,'Search')]//span[contains(@class,'comboBox') and .//input[contains(@aria-label,'Select a record to display')]]//input";
        private static final String MANAGE_DATA_FIELD = "//tr[contains(@class,'form_field ') and .//span[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']] | //tr[contains(@class,'form_field ') and .//label[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']]";
        private static final String MANAGE_DATA_FIELD_LABEL = "//div[contains(@class, 'ectFormContainer globalContainer')]//tr[contains(@class,'form_field') and .//span[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '[TEXT_TO_REPLACE]']]";

        //TIME OFF
        private static final String CREATE_ABSENCE_NAV_CON_BASE_DIV = ".//div[contains(@id,'absenceFormLayout') and contains(@class,'AbsenceForm')]";
        private static final String FORM_GENERATOR_FIELD_BASE_DIV = ".//div[contains(@class,'FormGeneratorField') and .//label[contains(translate(translate(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'\u00AD',''),'\u200B',''),'[TEXT_TO_REPLACE]')]]";
        private static final String DROPDOWN_MENU_OPTION = "//li[@role = 'option' and .//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '[TEXT_TO_REPLACE]')]]";
        private static final String POPUP_MESSAGE_BASE_DIV = "//div[contains(@class,'MessageToast') and @role = 'alert']";
        private static final String ABSENCES_AND_HOLIDAYS_DIALOG_BOX = ".//div[contains(@id,'allAbsencesDialog') and contains(@class,'sapMDialogOpen')]";
        private static final String BALANCES_PANEL_BASE_DIV = "//div[contains(@id,'balancesPanel') and .//div[contains(text(),'Balances')]]";
        private static final String UPCOMING_TIME_OFF_PANEL_BASE_DIV = "//div[contains(@id,'absencePanel') and .//div[contains(text(),'Upcoming Time Off')]]";
        private static final String APPROVED_ABSENCE = "//div[contains(@aria-label,'Approved') and //div[contains(@class,'sapUiCalSpecialDate')]]";

        //WORKFLOW
        private static final String TR_SPAN_BY_TEXT = ".//tr[contains(@class,'form_field') and .//span[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]";
        private static final String TD_BY_CLASS = "//td[contains(@class,'field_value')]";
//        private static final String WF_TABLEROW = ".//tr[contains(@class,'form_field') and .//span[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]" + TD_BY_CLASS;
        private static final String WF_TABLEROW = TR_SPAN_BY_TEXT + TD_BY_CLASS;
        private static final String LI_CONTAINER = ".//li[contains(@id,'objectListAllItem') and .//span[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]]";
        private static final String SEGMENT_BAR = "//ul[contains(@class,'sapMSegB sapMBarChild')]//li[contains(translate(@title,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'[TEXT_TO_REPLACE]')]";
        private static final String PANEL_CONTENT = "//div[contains(@class,'panelContent')]";
        private static final String CHECKBOX = "//input[@type='CheckBox']/..";

    }
}