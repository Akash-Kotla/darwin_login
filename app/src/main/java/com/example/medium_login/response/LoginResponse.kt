package com.example.medium_login.response

import com.google.gson.annotations.SerializedName
import retrofit2.Response



  class LoginResponse {
    @SerializedName("response" )
    var response : Response? = Response()


    data class ClientData (

        @SerializedName("_id" )
        var Id  : String? = null,
        @SerializedName("first_name" )
        var firstName : String? = null,
        @SerializedName("last_name" )
        var lastName   : String? = null,
        @SerializedName("email")
        var email  : String? = null,
        @SerializedName("role")
        var role  : String? = null,
        @SerializedName("sessionstartDate")
        var sessionstartDate : String? = null,
        @SerializedName("sessionendDate")
        var sessionendDate  : String? = null

    )

    data class Response (

        @SerializedName("clientData")
        var clientData : ClientData? = ClientData(),
        @SerializedName("sessiontoken")
        var sessiontoken : String?  = null,
        @SerializedName("roles")
        var roles
        : ArrayList<String> = arrayListOf()

    )

}
