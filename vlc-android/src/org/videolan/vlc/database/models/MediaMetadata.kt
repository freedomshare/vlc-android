/*
 * ************************************************************************
 *  MediaMetadata.kt
 * *************************************************************************
 * Copyright © 2019 VLC authors and VideoLAN
 * Author: Nicolas POMEPUY
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 * **************************************************************************
 *
 *
 */

/*******************************************************************************
 *  BrowserFav.kt
 * ****************************************************************************
 * Copyright © 2018 VLC authors and VideoLAN
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 ******************************************************************************/

package org.videolan.vlc.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "media_metadata", foreignKeys = [ForeignKey(entity = MediaTvshow::class, parentColumns = ["moviepedia_show_id"], childColumns = ["show_id"])])
data class MediaMetadata(
        @PrimaryKey
        @ColumnInfo(name = "ml_id")
        val mlId: Long,
        @ColumnInfo(name = "type")
        val type: Int,
        @ColumnInfo(name = "moviepedia_id")
        val moviepediaId: String,
        @ColumnInfo(name = "title")
        val title: String,
        @ColumnInfo(name = "summary")
        val summary: String,
        @ColumnInfo(name = "genres")
        val genres: String,
        @ColumnInfo(name = "release_date")
        val releaseDate: Date?,
        @ColumnInfo(name = "countries")
        val countries: String,
        @ColumnInfo(name = "current_poster")
        var currentPoster: String,
        @ColumnInfo(name = "season")
        val season: Int?,
        @ColumnInfo(name = "episode")
        val episode: Int?,
        @ColumnInfo(name = "current_backdrop")
        var currentBackdrop: String,
        @ColumnInfo(name = "show_id")
        var show_id: String?

)

