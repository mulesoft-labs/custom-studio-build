package org.foo.corp.branding;

import static org.mule.tooling.utils.CommonUtils.map;

import java.util.Map;

import org.mule.tooling.osgi.services.installation.InstallationInformationProviderService;

public class FooCorpInstallationService implements InstallationInformationProviderService {

    private static final String BASE_URL = "http://www.foocorp.org";

    @Override
    public boolean isNightlyBuild() {
        return false;
    }

    @Override
    public Map<String, String> getBrandingDetails() {
        return map( //
                BRANDING_COMPANY_NAME, "Foo Corp", //
                BRANDING_PRODUCT_NAME, "Foo Corp Designer" //
        );
    }

    @Override
    public Map<String, String> getPreferencesDefaultValues() {
        return map(//
                PREFERENCES_ANALYTICS_URL,          BASE_URL + "/analytics", //
                PREFERENCES_API_PLATFORM_URL,       BASE_URL + "/apiplatform", //
                PREFERENCES_CORESERVICES_URL,       BASE_URL + "/coreservices", //
                PREFERENCES_EXCHANGE_URL,           BASE_URL + "/exchange", //
                PREFERENCES_DEFAULT_LOGIN_URL,      BASE_URL + "/login", //
                PREFERENCES_PLATFORM_BASEURL,       BASE_URL + "/platform", //
                PREFERENCES_DEFAULT_CLOUDHUB_URL,   BASE_URL + "/cloudhub" //
        );
    }

}
