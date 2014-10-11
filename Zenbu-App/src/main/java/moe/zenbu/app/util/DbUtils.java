/*
 * Zenbu is a cross-platform, multi functional anime/manga management client with a modern UI and exceptional features
 * Copyright (C) 2014 Vincent Szolnoky a.k.a. Ippytraxx
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU General Public License as published by
 * Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package moe.zenbu.app.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtils
{
    private final static SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(DbUtils.class.getResourceAsStream("/mybatis-config.xml"));

    public static SqlSession getSqlSession()
    {
        return sqlSession.openSession();
    }
}
