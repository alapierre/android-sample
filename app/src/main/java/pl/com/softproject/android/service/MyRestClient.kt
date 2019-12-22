package pl.com.softproject.android.service

import org.androidannotations.rest.spring.annotations.Get
import org.androidannotations.rest.spring.annotations.Rest
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import pl.com.softproject.android.PostMessage

@Rest(
    rootUrl = "https://jsonplaceholder.typicode.com",
    converters = [MappingJackson2HttpMessageConverter::class]
)
interface MyRestClient {

    @Get("/posts")
    fun employees(): List<PostMessage>

}