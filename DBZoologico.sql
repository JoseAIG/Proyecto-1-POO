PGDMP     "                    x         	   Zoologico    12.3    12.3                 0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16397 	   Zoologico    DATABASE     �   CREATE DATABASE "Zoologico" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE "Zoologico";
                postgres    false            �            1259    16463    animales    TABLE     �   CREATE TABLE public.animales (
    identificacion integer NOT NULL,
    animal character varying(10),
    especie character varying(10),
    apodo character varying(15),
    edad integer NOT NULL,
    peso numeric(7,2),
    extra character varying(10)
);
    DROP TABLE public.animales;
       public         heap    postgres    false            �
          0    16463    animales 
   TABLE DATA           ]   COPY public.animales (identificacion, animal, especie, apodo, edad, peso, extra) FROM stdin;
    public          postgres    false    202   +       ~
           2606    16467    animales animales_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.animales
    ADD CONSTRAINT animales_pkey PRIMARY KEY (identificacion);
 @   ALTER TABLE ONLY public.animales DROP CONSTRAINT animales_pkey;
       public            postgres    false    202            �
      x������ � �     