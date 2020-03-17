package com.paysera.currency.exchange.client

import com.paysera.currency.exchange.client.model.PayseraResponse
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by eduardo.delito on 3/11/20.
 */
interface PayseraApiService {
    @GET("latest/")
    fun getCurrencies(): Observable<PayseraResponse>
}
