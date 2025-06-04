package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PersonaSessionBankModel
import app.cybrid.cybrid_api_bank.client.models.PostPersonaSessionBankModel

interface PersonaSessionsApi {
    /**
     * Create Persona Session
     * Create a Persona session.  Required scope: **persona_sessions:execute**
     * Responses:
     *  - 201: session created
     *  - 409: Inquiry already completed
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: Identity verification not found
     *
     * @param postPersonaSessionBankModel 
     * @return [PersonaSessionBankModel]
     */
    @POST("api/persona_sessions")
    suspend fun createPersonaSession(@Body postPersonaSessionBankModel: PostPersonaSessionBankModel): Response<PersonaSessionBankModel>

}
