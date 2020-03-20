package com.gabz18.prositmarkdown

import org.springframework.lang.NonNull

/**
 *
 * @author gritzenthaler
 */
class Prosit(@NonNull val title: String,
             @NonNull val keywords: List<String>,
             @NonNull val context: String,
             @NonNull val constraints: List<String>,
             @NonNull val problems: List<String>,
             @NonNull val generalisation: String,
             @NonNull val deliveries: List<String>,
             @NonNull val solutions: List<String>,
             @NonNull val plan: List<String>,
             @NonNull val members: Members
             )

class Members(
        val animator: String?,
        val scrib: String?,
        val secretary: String?,
        val gestionary: String?
)