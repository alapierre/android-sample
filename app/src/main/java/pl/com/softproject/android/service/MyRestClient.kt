package pl.com.softproject.android.service

import org.androidannotations.rest.spring.annotations.Get
import org.androidannotations.rest.spring.annotations.Rest
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import pl.com.softproject.android.Emploee

@Rest(
    rootUrl = "http://dummy.restapiexample.com/api/v1",
    converters = [MappingJackson2HttpMessageConverter::class]
)
interface MyRestClient {

    @Get("/employees")
    fun employees(): List<Emploee>

}