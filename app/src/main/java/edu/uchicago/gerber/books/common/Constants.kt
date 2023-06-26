package edu.uchicago.gerber.books.common



import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.gson.Gson
import edu.uchicago.gerber.books.data.models.Item
import edu.uchicago.gerber.books.data.models.VolumesResponse


object Constants {

    val modifier = Modifier.padding(paddingValues = PaddingValues(all = 0.dp))

    val googleUrl = "https://www.googleapis.com/"
    val fakeBook: Item
    val fakeResponse: VolumesResponse
    //use init to parse the raw response-body
    init {
        val gson = Gson()
        val hardCodedResponse = """

{
  "kind": "books#volumes",
  "totalItems": 1782,
  "items": [
    {
      "kind": "books#volume",
      "id": "Xje2DwAAQBAJ",
      "etag": "4Mk+/RacIW4",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/Xje2DwAAQBAJ",
      "volumeInfo": {
        "title": "Mastering Kotlin",
        "subtitle": "Learn advanced Kotlin programming techniques to build apps for Android, iOS, and the web",
        "authors": [
          "Nate Ebel"
        ],
        "publisher": "Packt Publishing Ltd",
        "publishedDate": "2019-10-11",
        "description": "Explore popular language features, Java to Kotlin interoperability, advanced topics, and practical applications by building a variety of sample projects Key Features Understand and leverage the syntax, tools, and patterns by writing code in Kotlin Explore practical topics such as Java interop, concurrency with coroutines, and functional programming Discover how to use Kotlin for build targets like Android, iOS, JavaScript, and backend service Book Description Using Kotlin without taking advantage of its power and interoperability is like owning a sports car and never taking it out of the garage. While documentation and introductory resources can help you learn the basics of Kotlin, the fact that it’s a new language means that there are limited learning resources and code bases available in comparison to Java and other established languages. This Kotlin book will show you how to leverage software designs and concepts that have made Java the most dominant enterprise programming language. You’ll understand how Kotlin is a modern approach to object-oriented programming (OOP). This book will take you through the vast array of features that Kotlin provides over other languages. These features include seamless interoperability with Java, efficient syntax, built-in functional programming constructs, and support for creating your own DSL. Finally, you will gain an understanding of implementing practical design patterns and best practices to help you master the Kotlin language. By the end of the book, you'll have obtained an advanced understanding of Kotlin in order to be able to build production-grade applications. What you will learn Model data using interfaces, classes, and data classes Grapple with practical interoperability challenges and solutions with Java Build parallel apps using concurrency solutions such as coroutines Explore functional, reactive, and imperative programming to build flexible apps Discover how to build your own domain-specific language Embrace functional programming using the standard library and Arrow Delve into the use of Kotlin for frontend JavaScript development Build server-side services using Kotlin and Ktor Who this book is for If you’re a Kotlin developer looking to further their skills or a professional Java developer looking for better or professional resources in order to make a switch to Kotlin, this book is for you. Familiarity with Kotlin programming will assist with understanding key concepts covered in the book.",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781838552367"
          },
          {
            "type": "ISBN_10",
            "identifier": "1838552367"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 434,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "0.1.1.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=Xje2DwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=Xje2DwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=Xje2DwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=2&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=Xje2DwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=Xje2DwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 27.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 17.19,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=Xje2DwAAQBAJ&rdid=book-Xje2DwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 27990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 17190000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true
        },
        "pdf": {
          "isAvailable": true
        },
        "webReaderLink": "http://play.google.com/books/reader?id=Xje2DwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "The purpose of Mastering Kotlin is to teach you how to leverage software designs and concepts which have made Java the most dominant Enterprise programming language."
      }
    },
    {
      "kind": "books#volume",
      "id": "Ol9qDwAAQBAJ",
      "etag": "JoNCHsX+ruE",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/Ol9qDwAAQBAJ",
      "volumeInfo": {
        "title": "Kotlin Programming",
        "subtitle": "The Big Nerd Ranch Guide",
        "authors": [
          "Josh Skeen",
          "David Greenhalgh"
        ],
        "publisher": "Pearson Technology Group",
        "publishedDate": "2018-08-09",
        "description": "Kotlin is a statically typed programming language designed to interoperate with Java and fully supported by Google on the Android operating system. Based on Big Nerd Ranch’s popular Kotlin Essentials course, this guide shows you how to work effectively with the Kotlin programming language through hands-on examples and clear explanations of key Kotlin concepts and foundational APIs. Written for Kotlin 1.2, this book will also introduce you to JetBrains’ IntelliJ IDEA development environment. Whether you are an experienced Android developer looking for modern features beyond what Java offers or a new developer ready to learn your first programming language, the authors will guide you from first principles to advanced usage of Kotlin. By the end of this book, you will be empowered to create reliable, concise applications in Kotlin.",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9780135162361"
          },
          {
            "type": "ISBN_10",
            "identifier": "013516236X"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 480,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "1.2.2.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=Ol9qDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=Ol9qDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=Ol9qDwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=3&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=Ol9qDwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=Ol9qDwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 35.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 20.49,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=Ol9qDwAAQBAJ&rdid=book-Ol9qDwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 35990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 20490000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true,
          "acsTokenLink": "http://books.google.com/books/download/Kotlin_Programming-sample-epub.acsm?id=Ol9qDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
        },
        "pdf": {
          "isAvailable": true,
          "acsTokenLink": "http://books.google.com/books/download/Kotlin_Programming-sample-pdf.acsm?id=Ol9qDwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
        },
        "webReaderLink": "http://play.google.com/books/reader?id=Ol9qDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "By the end of this book, you will be empowered to create reliable, concise applications in Kotlin."
      }
    },
    {
      "kind": "books#volume",
      "id": "CzCWDwAAQBAJ",
      "etag": "3rO3x2N3GeI",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/CzCWDwAAQBAJ",
      "volumeInfo": {
        "title": "Android Programming with Kotlin for Beginners",
        "subtitle": "Build Android apps starting from zero programming experience with the new Kotlin programming language",
        "authors": [
          "John Horton"
        ],
        "publisher": "Packt Publishing Ltd",
        "publishedDate": "2019-04-30",
        "description": "Build smart looking Kotlin apps with UI and functionality for the Android platform Key Features Start your Android programming career, or just have fun publishing apps on Google Play marketplace The first-principle introduction to Kotlin through Android, to start building easy-to-use apps Learn by example and build four real-world apps and dozens of mini-apps Book Description Android is the most popular mobile operating system in the world and Kotlin has been declared by Google as a first-class programming language to build Android apps. With the imminent arrival of the most anticipated Android update, Android 10 (Q), this book gets you started building apps compatible with the latest version of Android. It adopts a project-style approach, where we focus on teaching the fundamentals of Android app development and the essentials of Kotlin by building three real-world apps and more than a dozen mini-apps. The book begins by giving you a strong grasp of how Kotlin and Android work together before gradually moving onto exploring the various Android APIs for building stunning apps for Android with ease. You will learn to make your apps more presentable using different layouts. You will dive deep into Kotlin programming concepts such as variables, functions, data structures, Object-Oriented code, and how to connect your Kotlin code to the UI. You will learn to add multilingual text so that your app is accessible to millions of more potential users. You will learn how animation, graphics, and sound effects work and are implemented in your Android app. By the end of the book, you will have sound knowledge about significant Kotlin programming concepts and start building your own fully featured Android apps. What you will learn Learn how Kotlin and Android work together Build a graphical drawing app using Object-Oriented Programming (OOP) principles Build beautiful, practical layouts using ScrollView, RecyclerView, NavigationView, ViewPager and CardView Write Kotlin code to manage an apps' data using different strategies including JSON and the built-in Android SQLite database Add user interaction, data captures, sound, and animation to your apps Implement dialog boxes to capture input from the user Build a simple database app that sorts and stores the user's data Who this book is for This book is for people who are new to Kotlin, Android and want to develop Android apps.It also acts as a refresher for those who have some experience in programming with Android and Kotlin.",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781789800883"
          },
          {
            "type": "ISBN_10",
            "identifier": "1789800889"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 698,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "1.1.1.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=CzCWDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=CzCWDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=CzCWDwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=4&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=CzCWDwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=CzCWDwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 27.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 23.22,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=CzCWDwAAQBAJ&rdid=book-CzCWDwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 27990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 23220000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true
        },
        "pdf": {
          "isAvailable": true
        },
        "webReaderLink": "http://play.google.com/books/reader?id=CzCWDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "With the imminent arrival of the most anticipated Android update, Android 10 (Q), this book gets you started building apps compatible with the latest version of Android."
      }
    },
    {
      "kind": "books#volume",
      "id": "OzkzEAAAQBAJ",
      "etag": "KnvnXTJy1ec",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/OzkzEAAAQBAJ",
      "volumeInfo": {
        "title": "Kotlin in Action",
        "authors": [
          "Dmitry Jemerov",
          "Svetlana Isakova"
        ],
        "publisher": "Simon and Schuster",
        "publishedDate": "2017-02-03",
        "description": "Summary Kotlin in Action guides experienced Java developers from the language basics of Kotlin all the way through building applications to run on the JVM and Android devices. Foreword by Andrey Breslav, Lead Designer of Kotlin. Purchase of the print book includes a free eBook in PDF, Kindle, and ePub formats from Manning Publications. About the Technology Developers want to get work done - and the less hassle, the better. Coding with Kotlin means less hassle. The Kotlin programming language offers an expressive syntax, a strong intuitive type system, and great tooling support along with seamless interoperability with existing Java code, libraries, and frameworks. Kotlin can be compiled to Java bytecode, so you can use it everywhere Java is used, including Android. And with an effi cient compiler and a small standard library, Kotlin imposes virtually no runtime overhead. About the Book Kotlin in Action teaches you to use the Kotlin language for production-quality applications. Written for experienced Java developers, this example-rich book goes further than most language books, covering interesting topics like building DSLs with natural language syntax. The authors are core Kotlin developers, so you can trust that even the gnarly details are dead accurate. What's Inside Functional programming on the JVM Writing clean and idiomatic code Combining Kotlin and Java Domain-specific languages About the Reader This book is for experienced Java developers. About the Author Dmitry Jemerov and Svetlana Isakova are core Kotlin developers at JetBrains. Table of Contents PART 1 - INTRODUCING KOTLIN Kotlin: what and why Kotlin basics Defining and calling functions Classes, objects, and interfaces Programming with lambdas The Kotlin type system PART 2 - EMBRACING KOTLIN Operator overloading and other conventions Higher-order functions: lambdas as parameters and return values Generics Annotations and reflection DSL construction",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781638353690"
          },
          {
            "type": "ISBN_10",
            "identifier": "1638353697"
          }
        ],
        "readingModes": {
          "text": true,
          "image": false
        },
        "pageCount": 360,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "preview-1.0.0",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=OzkzEAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=OzkzEAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=OzkzEAAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=5&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=OzkzEAAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=OzkzEAAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 34.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 34.99,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=OzkzEAAAQBAJ&rdid=book-OzkzEAAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 34990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 34990000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED_FOR_ACCESSIBILITY",
        "epub": {
          "isAvailable": true,
          "acsTokenLink": "http://books.google.com/books/download/Kotlin_in_Action-sample-epub.acsm?id=OzkzEAAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
        },
        "pdf": {
          "isAvailable": false
        },
        "webReaderLink": "http://play.google.com/books/reader?id=OzkzEAAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "And with an effi cient compiler and a small standard library, Kotlin imposes virtually no runtime overhead. About the Book Kotlin in Action teaches you to use the Kotlin language for production-quality applications."
      }
    },
    {
      "kind": "books#volume",
      "id": "MVDNDwAAQBAJ",
      "etag": "ItPf5ZaaPCY",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/MVDNDwAAQBAJ",
      "volumeInfo": {
        "title": "Kotlin In-Depth [Vol-I]",
        "subtitle": "A Comprehensive Guide to Modern Multi-Paradigm Language",
        "authors": [
          "Aleksei Sedunov"
        ],
        "publisher": "BPB Publications",
        "publishedDate": "2020-01-31",
        "description": "Master the concise and expressive power of a pragmatic, multi-paradigm language for JVM, Android and beyond DESCRIPTION The purpose of this book is to guide a reader through the capabilities of Kotlin language and give examples of how to use it for the development of various applications, be it desktop, mobile or Web. Although our primary focus is on JVM and Android, the knowledge we’re sharing here, to various extents, applies to other Kotlin-supported platforms such as JavaScript, native and even multi-platform applications. The book starts with an introduction to the language and its ecosystem, which will give you an understanding of the key ideas behind the Kotlin design, introduce you to the Kotlin tooling and present you the basic language syntax and constructs. In the next chapters, we get to know the multi-paradigm nature of Kotlin which allows us to create powerful abstractions by combining various aspects of functional and object-oriented programming. We’ll talk about using common Kotlin APIs, such as the standard library, reflection, and coroutine-based concurrency as well as the means for creating your own flexible APIs based on domain-specific languages. In the concluding chapters, we give examples of using Kotlin for more specialized tasks, such as testing, building Android applications, Web development and creating microservices. KEY FEATURES ● Language fundamentals ● Object-oriented and functional programming with Kotlin ● Kotlin standard library ● Building domain-specific languages ● Using Kotlin for Web development ● Kotlin for Android platform ● Coroutine-based concurrency WHAT WILL YOU LEARN By the end of the book you’ll obtain a thorough knowledge of all the basic aspects of Kotlin programming. You’ll be able to create a flexible and reusable code by taking advantage of object-oriented and functional features, use Kotlin standard library, compose your own domain-specific languages, write asynchronous code using Kotlin coroutines library as well. You’ll also have a basic understanding of using Kotlin for writing test code, web applications and Android development. This knowledge will also give you a solid foundation for deeper learning of related development platforms, tools, and frameworks. WHO IS THIS BOOK FOR The book is primarily aimed at developers who are familiar with Java and JVM and are willing to get a firm understanding of Kotlin while having little to no experience in that language. Discussion of various language features will be accompanied, if deemed necessary, by comparisons with their Java’s analogs, which should simplify the Java-to-Kotlin transition. Most of the material, however, is rather Java-agnostic and should be beneficial even without prior knowledge of Java. In general, experience in object-oriented or functional paradigm is a plus, but not required. Table of Contents 1. Kotlin: Powerful and Pragmatic 2. Language Fundamentals 3. Defining Functions 4. Working with Classes and Objects 5. Leveraging Advanced Functions and Functional Programming 6. Using Special-Case Classes 7. Understanding Class Hierarchies 8. Exploring Collections and I/O 9. Generics 10. Annotations and Reflection 11. Domain-Specific Languages 12. Java Interoperability 13. Concurrency 14. Testing with Kotlin 15. Android Applications 16. Web Development with Ktor 17. Building Microservices",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9789389328585"
          },
          {
            "type": "ISBN_10",
            "identifier": "9389328586"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 324,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "averageRating": 4.5,
        "ratingsCount": 2,
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "1.1.1.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=MVDNDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=MVDNDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=MVDNDwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=6&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=MVDNDwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=MVDNDwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 9.95,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 9.95,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=MVDNDwAAQBAJ&rdid=book-MVDNDwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 9950000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 9950000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true,
          "acsTokenLink": "http://books.google.com/books/download/Kotlin_In_Depth_Vol_I-sample-epub.acsm?id=MVDNDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
        },
        "pdf": {
          "isAvailable": true,
          "acsTokenLink": "http://books.google.com/books/download/Kotlin_In_Depth_Vol_I-sample-pdf.acsm?id=MVDNDwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
        },
        "webReaderLink": "http://play.google.com/books/reader?id=MVDNDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "Master the concise and expressive power of a pragmatic, multi-paradigm language for JVM, Android and beyond DESCRIPTIONÊ The purpose of this book is to guide a reader through the capabilities of Kotlin language and give examples of how to ..."
      }
    },
    {
      "kind": "books#volume",
      "id": "6909EAAAQBAJ",
      "etag": "/XoenLDgXaE",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/6909EAAAQBAJ",
      "volumeInfo": {
        "title": "Java to Kotlin",
        "authors": [
          "Duncan McGregor",
          "Nat Pryce"
        ],
        "publisher": "\"O'Reilly Media, Inc.\"",
        "publishedDate": "2021-08-16",
        "description": "It takes a week to travel the 8,000 miles overland from Java to Kotlin. If you're an experienced Java developer who has tried the Kotlin language, you were probably productive in about the same time. You'll have found that they do things differently in Kotlin, though. Nullability is important, collections are different, and classes are final by default. Kotlin is more functional, but what does that mean, and how should it change the way that you program? And what about all that Java code that you still have to support? Your tour guides Duncan and Nat first made the trip in 2015, and they've since helped many teams and individuals follow in their footsteps. Travel with them as they break the route down into legs like Optional to Nullable, Beans to Values, and Open to Sealed Classes. Each explains a key concept and then shows how to refactor production Java to idiomatic Kotlin, gradually and safely, while maintaining interoperability. The resulting code is simpler, more expressive, and easier to change. By the end of the journey, you'll be confident in refactoring Java to Kotlin, writing Kotlin from scratch, and managing a mixed language codebase as it evolves over time.",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781492082248"
          },
          {
            "type": "ISBN_10",
            "identifier": "1492082244"
          }
        ],
        "readingModes": {
          "text": false,
          "image": true
        },
        "pageCount": 424,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": false,
        "contentVersion": "preview-1.0.0",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=6909EAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=6909EAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=6909EAAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=7&source=gbs_api",
        "infoLink": "http://books.google.com/books?id=6909EAAAQBAJ&dq=kotlin&hl=&source=gbs_api",
        "canonicalVolumeLink": "https://books.google.com/books/about/Java_to_Kotlin.html?hl=&id=6909EAAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "NOT_FOR_SALE",
        "isEbook": false
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": false
        },
        "pdf": {
          "isAvailable": false
        },
        "webReaderLink": "http://play.google.com/books/reader?id=6909EAAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "It takes a week to travel the 8,000 miles overland from Java to Kotlin. If you&#39;re an experienced Java developer who has tried the Kotlin language, you were probably productive in about the same time."
      }
    },
    {
      "kind": "books#volume",
      "id": "K9oLtQEACAAJ",
      "etag": "SwdckRR0uXw",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/K9oLtQEACAAJ",
      "volumeInfo": {
        "title": "The Joy of Kotlin",
        "authors": [
          "Pierre-Yves Saumont"
        ],
        "publisher": "Manning Publications",
        "publishedDate": "2019-04-27",
        "description": "Summary Maintaining poor legacy code, interpreting cryptic comments, and writing the same boilerplate over and over can suck the joy out of your life as a Java developer. Fear not! There's hope! Kotlin is an elegant JVM language with modern features and easy integration with Java. The Joy of Kotlin teaches you practical techniques to improve abstraction and design, to write comprehensible code, and to build maintainable bug-free applications. Purchase of the print book includes a free eBook in PDF, Kindle, and ePub formats from Manning Publications. About the Technology Your programming language should be expressive, safe, flexible, and intuitive, and Kotlin checks all the boxes! This elegant JVM language integrates seamlessly with Java, and makes it a breeze to switch between OO and functional styles of programming. It's also fully supported by Google as a first-class Android language. Master the powerful techniques in this unique book, and you'll be able to take on new challenges with increased confidence and skill. About the Book The Joy of Kotlin teaches you to write comprehensible, easy-to-maintain, safe programs with Kotlin. In this expert guide, seasoned engineer Pierre-Yves Saumont teaches you to approach common programming challenges with a fresh, FP-inspired perspective. As you work through the many examples, you'll dive deep into handling errors and data properly, managing state, and taking advantage of laziness. The author's down-to-earth examples and experience-driven insights will make you a better--and more joyful--developer! What's inside Programming with functions Dealing with optional data Safe handling of errors and exceptions Handling and sharing state mutation About the Reader Written for intermediate Java or Kotlin developers. About the Author Pierre-Yves Saumont is a senior software engineer at Alcatel-Submarine Networks. He's the author of Functional Programming in Java (Manning, 2017). Table of Contents Making programs safer Functional programming in Kotlin: An overview Programming with functions Recursion, corecursion, and memoization Data handling with lists Dealing with optional data Handling errors and exceptions Advanced list handling Working with laziness More data handling with trees Solving problems with advanced trees Functional input/output Sharing mutable states with actors Solving common problems functionally",
        "industryIdentifiers": [
          {
            "type": "ISBN_10",
            "identifier": "1617295361"
          },
          {
            "type": "ISBN_13",
            "identifier": "9781617295362"
          }
        ],
        "readingModes": {
          "text": false,
          "image": false
        },
        "pageCount": 480,
        "printType": "BOOK",
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": false,
        "contentVersion": "preview-1.0.0",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=K9oLtQEACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=K9oLtQEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=K9oLtQEACAAJ&dq=kotlin&hl=&cd=8&source=gbs_api",
        "infoLink": "http://books.google.com/books?id=K9oLtQEACAAJ&dq=kotlin&hl=&source=gbs_api",
        "canonicalVolumeLink": "https://books.google.com/books/about/The_Joy_of_Kotlin.html?hl=&id=K9oLtQEACAAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "NOT_FOR_SALE",
        "isEbook": false
      },
      "accessInfo": {
        "country": "US",
        "viewability": "NO_PAGES",
        "embeddable": false,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": false
        },
        "pdf": {
          "isAvailable": false
        },
        "webReaderLink": "http://play.google.com/books/reader?id=K9oLtQEACAAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "NONE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "In this expert guide, seasoned engineer Pierre-Yves Saumont teaches you to approach common programming challenges with a fresh, FP-inspired perspective."
      }
    },
    {
      "kind": "books#volume",
      "id": "jOpgDwAAQBAJ",
      "etag": "FUgJbBVM/S4",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/jOpgDwAAQBAJ",
      "volumeInfo": {
        "title": "Hands-On Design Patterns with Kotlin",
        "subtitle": "Build scalable applications using traditional, reactive, and concurrent design patterns in Kotlin",
        "authors": [
          "Alexey Soshin"
        ],
        "publisher": "Packt Publishing Ltd",
        "publishedDate": "2018-06-15",
        "description": "Make the most of Kotlin by leveraging design patterns and best practices to build scalable and high performing apps Key Features Understand traditional GOF design patterns to apply generic solutions Shift from OOP to FP; covering reactive and concurrent patterns in a step-by-step manner Choose the best microservices architecture and MVC for your development environment Book Description Design patterns enable you as a developer to speed up the development process by providing you with proven development paradigms. Reusing design patterns helps prevent complex issues that can cause major problems, improves your code base, promotes code reuse, and makes an architecture more robust. The mission of this book is to ease the adoption of design patterns in Kotlin and provide good practices for programmers. The book begins by showing you the practical aspects of smarter coding in Kotlin, explaining the basic Kotlin syntax and the impact of design patterns. From there, the book provides an in-depth explanation of the classical design patterns of creational, structural, and behavioral families, before heading into functional programming. It then takes you through reactive and concurrent patterns, teaching you about using streams, threads, and coroutines to write better code along the way By the end of the book, you will be able to efficiently address common problems faced while developing applications and be comfortable working on scalable and maintainable projects of any size. What you will learn Get to grips with Kotlin principles, including its strengths and weaknesses Understand classical design patterns in Kotlin Explore functional programming using built-in features of Kotlin Solve real-world problems using reactive and concurrent design patterns Use threads and coroutines to simplify concurrent code flow Understand antipatterns to write clean Kotlin code, avoiding common pitfalls Learn about the design considerations necessary while choosing between architectures Who this book is for This book is for developers who would like to master design patterns with Kotlin to build efficient and scalable applications. Basic Java or Kotlin programming knowledge is assumed",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781788999595"
          },
          {
            "type": "ISBN_10",
            "identifier": "1788999592"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 310,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "1.3.4.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=jOpgDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=jOpgDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=jOpgDwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=9&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=jOpgDwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=jOpgDwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 35.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 22.39,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=jOpgDwAAQBAJ&rdid=book-jOpgDwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 35990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 22390000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true
        },
        "pdf": {
          "isAvailable": true
        },
        "webReaderLink": "http://play.google.com/books/reader?id=jOpgDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "Reusing design patterns helps prevent complex issues, improves your code base, promotes code reuse, and makes the architecture more robust. This book will ease the adoption of design patterns in Kotlin and provide best practices."
      }
    },
    {
      "kind": "books#volume",
      "id": "U8MkzgEACAAJ",
      "etag": "7aMIObLRp1M",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/U8MkzgEACAAJ",
      "volumeInfo": {
        "title": "Atomic Kotlin",
        "authors": [
          "Bruce Eckel",
          "Svetlana Isakova"
        ],
        "publishedDate": "2021-01-11",
        "description": "For both beginning and experienced programmers! From the author of the multi-award-winning Thinking in C++ and Thinking in Java together with a member of the Kotlin language team comes a book that breaks the concepts into small, easy-to-digest \"atoms,\" along with exercises supported by hints and solutions directly inside IntelliJ IDEA! No programming background necessary. Summaries for experienced programmers. Easy steps via very small chapters (\"atoms\"). Free accompanying exercises/solutions within IntelliJ Idea. Gives you a strong Kotlin foundation. Kotlin is cleaner, more consistent and far more powerful than Java. Increase programming productivity with Kotlin's clear, concise syntax. Produce safer, more reliable programs. Kotlin easily interacts with Java. Effortlessly migrate by adding pieces of Kotlin to an existing Java project. Support for Windows, Mac and Linux. Free version of Intellij IDEA includes extensive Kotlin support. Book resources, live seminars, workshops and consulting available at AtomicKotlin.com.",
        "industryIdentifiers": [
          {
            "type": "ISBN_10",
            "identifier": "0981872557"
          },
          {
            "type": "ISBN_13",
            "identifier": "9780981872551"
          }
        ],
        "readingModes": {
          "text": false,
          "image": false
        },
        "pageCount": 636,
        "printType": "BOOK",
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": false,
        "contentVersion": "preview-1.0.0",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=U8MkzgEACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=U8MkzgEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=U8MkzgEACAAJ&dq=kotlin&hl=&cd=10&source=gbs_api",
        "infoLink": "http://books.google.com/books?id=U8MkzgEACAAJ&dq=kotlin&hl=&source=gbs_api",
        "canonicalVolumeLink": "https://books.google.com/books/about/Atomic_Kotlin.html?hl=&id=U8MkzgEACAAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "NOT_FOR_SALE",
        "isEbook": false
      },
      "accessInfo": {
        "country": "US",
        "viewability": "NO_PAGES",
        "embeddable": false,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": false
        },
        "pdf": {
          "isAvailable": false
        },
        "webReaderLink": "http://play.google.com/books/reader?id=U8MkzgEACAAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "NONE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "For both beginning and experienced programmers!"
      }
    },
    {
      "kind": "books#volume",
      "id": "PJZGDwAAQBAJ",
      "etag": "hVU75uGiefI",
      "selfLink": "https://www.googleapis.com/books/v1/volumes/PJZGDwAAQBAJ",
      "volumeInfo": {
        "title": "Android Development with Kotlin",
        "authors": [
          "Marcin Moskala",
          "Igor Wojda"
        ],
        "publisher": "Packt Publishing Ltd",
        "publishedDate": "2017-08-30",
        "description": "Learn how to make Android development much faster using a variety of Kotlin features, from basics to advanced, to write better quality code. About This Book Leverage specific features of Kotlin to ease Android application development Write code based on both object oriented and functional programming to build robust applications Filled with various practical examples so you can easily apply your knowledge to real world scenarios Identify the improved way of dealing with common Java patterns Who This Book Is For This book is for developers who have a basic understanding of Java language and have 6-12 months of experience with Android development and developers who feel comfortable with OOP concepts. What You Will Learn Run a Kotlin application and understand the integration with Android Studio Incorporate Kotlin into new/existing Android Java based project Learn about Kotlin type system to deal with null safety and immutability Define various types of classes and deal with properties Define collections and transform them in functional way Define extensions, new behaviours to existing libraries and Android framework classes Use generic type variance modifiers to define subtyping relationship between generic types Build a sample application In Detail Nowadays, improved application development does not just mean building better performing applications. It has become crucial to find improved ways of writing code. Kotlin is a language that helps developers build amazing Android applications easily and effectively. This book discusses Kotlin features in context of Android development. It demonstrates how common examples that are typical for Android development, can be simplified using Kotlin. It also shows all the benefits, improvements and new possibilities provided by this language. The book is divided in three modules that show the power of Kotlin and teach you how to use it properly. Each module present features in different levels of advancement. The first module covers Kotlin basics. This module will lay a firm foundation for the rest of the chapters so you are able to read and understand most of the Kotlin code. The next module dives deeper into the building blocks of Kotlin, such as functions, classes, and function types. You will learn how Kotlin brings many improvements to the table by improving common Java concepts and decreasing code verbosity. The last module presents features that are not present in Java. You will learn how certain tasks can be achieved in simpler ways thanks to Kotlin. Through the book, you will learn how to use Kotlin for Android development. You will get to know and understand most important Kotlin features, and how they can be used. You will be ready to start your own adventure with Android development with Kotlin.",
        "industryIdentifiers": [
          {
            "type": "ISBN_13",
            "identifier": "9781787128989"
          },
          {
            "type": "ISBN_10",
            "identifier": "1787128989"
          }
        ],
        "readingModes": {
          "text": true,
          "image": true
        },
        "pageCount": 440,
        "printType": "BOOK",
        "categories": [
          "Computers"
        ],
        "maturityRating": "NOT_MATURE",
        "allowAnonLogging": true,
        "contentVersion": "1.2.3.0.preview.3",
        "panelizationSummary": {
          "containsEpubBubbles": false,
          "containsImageBubbles": false
        },
        "imageLinks": {
          "smallThumbnail": "http://books.google.com/books/content?id=PJZGDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
          "thumbnail": "http://books.google.com/books/content?id=PJZGDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
        },
        "language": "en",
        "previewLink": "http://books.google.com/books?id=PJZGDwAAQBAJ&printsec=frontcover&dq=kotlin&hl=&cd=11&source=gbs_api",
        "infoLink": "https://play.google.com/store/books/details?id=PJZGDwAAQBAJ&source=gbs_api",
        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=PJZGDwAAQBAJ"
      },
      "saleInfo": {
        "country": "US",
        "saleability": "FOR_SALE",
        "isEbook": true,
        "listPrice": {
          "amount": 35.99,
          "currencyCode": "USD"
        },
        "retailPrice": {
          "amount": 22.39,
          "currencyCode": "USD"
        },
        "buyLink": "https://play.google.com/store/books/details?id=PJZGDwAAQBAJ&rdid=book-PJZGDwAAQBAJ&rdot=1&source=gbs_api",
        "offers": [
          {
            "finskyOfferType": 1,
            "listPrice": {
              "amountInMicros": 35990000,
              "currencyCode": "USD"
            },
            "retailPrice": {
              "amountInMicros": 22390000,
              "currencyCode": "USD"
            },
            "giftable": true
          }
        ]
      },
      "accessInfo": {
        "country": "US",
        "viewability": "PARTIAL",
        "embeddable": true,
        "publicDomain": false,
        "textToSpeechPermission": "ALLOWED",
        "epub": {
          "isAvailable": true
        },
        "pdf": {
          "isAvailable": true
        },
        "webReaderLink": "http://play.google.com/books/reader?id=PJZGDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
        "accessViewStatus": "SAMPLE",
        "quoteSharingAllowed": false
      },
      "searchInfo": {
        "textSnippet": "This book discusses Kotlin features in context of Android development. It demonstrates how common examples that are typical for Android development, can be simplified using Kotlin."
      }
    }
  ]
}
    """
        fakeResponse =
            gson.fromJson<VolumesResponse>(hardCodedResponse, VolumesResponse::class.java)
        fakeBook = fakeResponse.items[0]
    }


}